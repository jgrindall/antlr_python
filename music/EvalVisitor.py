if __name__ is not None and "." in __name__:
    from .ExprParser import ExprParser
    from .ExprVisitor import ExprVisitor
else:
    from ExprParser import ExprParser
    from ExprVisitor import ExprVisitor
    
    
val = 0
notes_map = {}
notes_scale = ["A", "B", "C", "D", "E", "F", "G"]
notes_numbers = range(0, 10)
for i in notes_numbers:
    for j in notes_scale:
        notes_map[str(j) + str(i)] = val   
        val += 1

notes_map_swapped = {v: k for k, v in notes_map.items()}
class EvalVisitor(ExprVisitor):

    def __init__(self):
        self._stack = []
        self._procedures = {}
        self._notes = []
        self.make_new_stack()

    #make a new stack
    def make_new_stack(self):
        stack = {}
        self._stack.append(stack)
    
    def pop_stack(self):
        self._stack.pop()

    def set_variable(self, name, val):
        self.current_scope[name] = val

    def get_variable_value(self, name):
        return self.current_scope[name]

    @property
    def notes(self):
        return self._notes
    
    def lookup_note_name(self, i):
        if i in notes_map_swapped:
            return notes_map_swapped[i]
        else:
            raise "no note with value " + i
    
    @property
    def current_scope(self):
        return self._stack[-1]

    # Visit a parse tree produced by ExprParser#root.
    def visitRoot(self, ctx:ExprParser.RootContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by ExprParser#proc_def.
    def visitProc_def(self, ctx:ExprParser.Proc_defContext):
        l = list(ctx.getChildren())
        proc_name = l[0].getText()
        val2 = l[2].getText()
        param_names = []
        if val2 == "|:":
            # a function with params
            param_names = self.visit(l[1])
            instructions_node = l[3]
        else:
            # a function with no params
            instructions_node = l[2]

        self._procedures[proc_name] = {
            "name" : proc_name,
            "num_params": len(param_names),
            "param_names": param_names,
            "instructions_node": instructions_node
        }

    # Visit a parse tree produced by ExprParser#proc_call.
    def visitProc_call(self, ctx:ExprParser.Proc_callContext):
        l = list(ctx.getChildren())
        proc_name = l[0].getText()
        if proc_name in self._procedures:
            proc =  self._procedures[proc_name]
            if len(l) == 2:
                #with args
                values = self.visit(l[1])
                #get all the values
                param_names = proc["param_names"]
                self.make_new_stack()
                for i, name in enumerate(param_names):
                    self.set_variable(name, values[i])
            self.visit(proc["instructions_node"])
            self.pop_stack()
        
        else:
            raise "no proc called " + proc_name

    # Visit a parse tree produced by ExprParser#expr_list.
    def visitExpr_list(self, ctx:ExprParser.Expr_listContext):
        l = list(ctx.getChildren())
        values = l[0::2]
        return list(map(lambda child: self.visit(child), values))

    # Visit a parse tree produced by ExprParser#args_list.
    def visitArgs_list(self, ctx:ExprParser.Args_listContext):
        l = list(ctx.getChildren())
        values = l[0::2]
        return list(map(lambda child: child.getText(), values))

    # Visit a parse tree produced by ExprParser#assign.
    def visitAssign(self, ctx:ExprParser.AssignContext):
        l = list(ctx.getChildren())
        name = l[0].getText()
        val = self.visit(l[2])
        self.set_variable(name, val)
        
    # Visit a parse tree produced by ExprParser#input.
    def visitInput(self, ctx:ExprParser.InputContext):
        #input: PROMPT VAR_NAME;
        l = list(ctx.getChildren())
        input_val = input()
        name = l[1].getText()
        self.set_variable(name, input_val)


    # Visit a parse tree produced by ExprParser#output.
    def visitOutput(self, ctx:ExprParser.OutputContext):
        l = list(ctx.getChildren())
        val = self.visit(l[1])
        print("output", val)


    # Visit a parse tree produced by ExprParser#play.
    def visitPlay(self, ctx:ExprParser.PlayContext):
        #play: PLAY expr;
        l = list(ctx.getChildren())
        val = self.visit(l[1])
        self._notes.append(self.lookup_note_name(val))


    # Visit a parse tree produced by ExprParser#if_else.
    def visitIf_else(self, ctx:ExprParser.If_elseContext):
        #if_else: IF expr OPEN instructions CLOSE (ELSE OPEN instructions CLOSE)?;
        l = list(ctx.getChildren())
        test0 = self.visit(l[1])
        if test0 > 0:
            self.visit(l[3])
        else:
            if len(l) >= 8:
                self.visit(l[7])

    # Visit a parse tree produced by ExprParser#while_.
    def visitWhile_(self, ctx:ExprParser.While_Context):
        l = list(ctx.getChildren())
        test = l[1]
        def visit_test():
            return self.visit(test)
        while visit_test():
            self.visit(l[3])


    # Visit a parse tree produced by ExprParser#append.
    def visitAppend(self, ctx:ExprParser.AppendContext):
        #TODO - type check
        l = list(ctx.getChildren())
        value = self.visit(l[2])
        var_value = self.get_variable_value(l[0].getText())
        var_value.append(value)

    # Visit a parse tree produced by ExprParser#cut.
    def visitCut(self, ctx:ExprParser.CutContext):
        #cut: CUT VAR_NAME '[' expr ']';
        l = list(ctx.getChildren())
        index = self.visit(l[3])
        #if index is 1, we want the 0th
        var_value = self.get_variable_value(l[1].getText())
        del var_value[index - 1]

    # Visit a parse tree produced by ExprParser#add.
    def visitAdd(self, ctx:ExprParser.AddContext):
        l = list(ctx.getChildren())
        return self.visit(l[0]) + self.visit(l[2])


    # Visit a parse tree produced by ExprParser#sub.
    def visitSub(self, ctx:ExprParser.SubContext):
        l = list(ctx.getChildren())
        return self.visit(l[0]) - self.visit(l[2])


    # Visit a parse tree produced by ExprParser#mult.
    def visitMult(self, ctx:ExprParser.MultContext):
        l = list(ctx.getChildren())
        return self.visit(l[0]) * self.visit(l[2])


    # Visit a parse tree produced by ExprParser#string.
    def visitString(self, ctx:ExprParser.StringContext):
        l = list(ctx.getChildren())
        return l[1].getText()


    # Visit a parse tree produced by ExprParser#num.
    def visitNum(self, ctx:ExprParser.NumContext):
        l = list(ctx.getChildren())
        return float(l[0].getText())


    # Visit a parse tree produced by ExprParser#count.
    def visitCount(self, ctx:ExprParser.CountContext):
        # TODO - type check 
        
        l = list(ctx.getChildren())
        name = l[1].getText()
        value = self.get_variable_value(name)
        return len(value)


    # Visit a parse tree produced by ExprParser#lt.
    def visitLt(self, ctx:ExprParser.LtContext):
        l = list(ctx.getChildren())
        val = 1 if self.visit(l[0]) < self.visit(l[2])  else 0
        return val


    # Visit a parse tree produced by ExprParser#index.
    def visitIndex(self, ctx:ExprParser.IndexContext):
        #  | (VAR_NAME | list_) '[' expr ']' #index   
        l = list(ctx.getChildren())
        index = self.visit(l[2]) 
        if l[0].getText()[0] == "{":
            #its a list literal
            list_values = self.visit(l[0])
        else:
            #its a variable name
            list_values = self.get_variable_value(l[0].getText())
        #if you want index 1, it is really 0
        return list_values[index - 1]

    # Visit a parse tree produced by ExprParser#gt.
    def visitGt(self, ctx:ExprParser.GtContext):
        l = list(ctx.getChildren())
        val = 1 if self.visit(l[0]) > self.visit(l[2])  else 0
        return val


    # Visit a parse tree produced by ExprParser#div.
    def visitDiv(self, ctx:ExprParser.DivContext):
        l = list(ctx.getChildren())
        return self.visit(l[0]) / self.visit(l[2])


    # Visit a parse tree produced by ExprParser#notename.
    def visitNotename(self, ctx:ExprParser.NotenameContext):
        #NOTE_NAME: [A-G][0-9]?;
        l = list(ctx.getChildren())
        key = l[0].getText()
        if key in notes_map:
            return notes_map[key]
        else:
            raise "No note called " + key


    # Visit a parse tree produced by ExprParser#nameval.
    def visitNameval(self, ctx:ExprParser.NamevalContext):
        l = list(ctx.getChildren())
        name = l[0].getText()
        return self.get_variable_value(name)


    # Visit a parse tree produced by ExprParser#equals.
    def visitEquals(self, ctx:ExprParser.EqualsContext):
        l = list(ctx.getChildren())
        val = 1 if self.visit(l[0]) == self.visit(l[2])  else 0
        return val

    # Visit a parse tree produced by ExprParser#listval.
    def visitListval(self, ctx:ExprParser.ListvalContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    def visitList_(self, ctx:ExprParser.List_Context):
        l = list(ctx.getChildren())
        values = map(lambda child: self.visit(child), l[1:-1])
        _list = list(values) 
        return _list

    # Visit a parse tree produced by ExprParser#power.
    def visitPower(self, ctx:ExprParser.PowerContext):
        l = list(ctx.getChildren())
        return self.visit(l[0]) ** self.visit(l[2])


    # Visit a parse tree produced by ExprParser#bracketed.
    def visitBracketed(self, ctx:ExprParser.BracketedContext):
        l = list(ctx.getChildren())
        return self.visit(l[1])