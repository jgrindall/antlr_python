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
        notes_map[str(i) + str(j)] = val   
        val += 1

class EvalVisitor(ExprVisitor):

    def __init__(self):
        self._stack = []
        self._procedures = {}
        self._notes = []


    @property
    def notes(self):
        return self._notes
    
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
        proc =  self._procedures[proc_name]
        #make a new stack
        stack = {}
        self._stack.append(stack)
        if len(l) == 2:
            #with args
            values = self.visit(l[1])
            #get all the values
            param_names = proc["param_names"]
            for name, i in param_names:
                stack[name] = values[i]

        self.visit(proc["instructions_node"])
        

    # Visit a parse tree produced by ExprParser#expr_list.
    def visitExpr_list(self, ctx:ExprParser.Expr_listContext):
        l = list(ctx.getChildren())
        values = l[0::2]
        return map(lambda child: self.visit(child), values)

    # Visit a parse tree produced by ExprParser#args_list.
    def visitArgs_list(self, ctx:ExprParser.Args_listContext):
        l = list(ctx.getChildren())
        values = l[0::2]
        return map(lambda child: child.getText(), values)

    # Visit a parse tree produced by ExprParser#assign.
    def visitAssign(self, ctx:ExprParser.AssignContext):
        l = list(ctx.getChildren())
        name = l[0].getText()
        val = self.visit(l[2])
        self.current_scope[name] = val

    # Visit a parse tree produced by ExprParser#input.
    def visitInput(self, ctx:ExprParser.InputContext):
        #input: PROMPT VAR_NAME;
        l = list(ctx.getChildren())
        input_val = input()
        name = l[1].getText()
        self.current_scope[name] = input_val


    # Visit a parse tree produced by ExprParser#output.
    def visitOutput(self, ctx:ExprParser.OutputContext):
        l = list(ctx.getChildren())
        val = self.visit(l[1])
        print("outut", val)


    # Visit a parse tree produced by ExprParser#play.
    def visitPlay(self, ctx:ExprParser.PlayContext):
        #play: PLAY expr;
        val = self.visit(l[1])
        print("play lookup for ", val)


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
        var_value = self.current_scope[l[0].getText()]
        var_value.append(value)


    # Visit a parse tree produced by ExprParser#cut.
    def visitCut(self, ctx:ExprParser.CutContext):
        #cut: CUT VAR_NAME '[' expr ']';
        l = list(ctx.getChildren())
        index = self.visit(l[2])
        var_value = self.current_scope[l[1].getText()]
        del var_value[index]

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
        return float(l[1].getText())


    # Visit a parse tree produced by ExprParser#count.
    def visitCount(self, ctx:ExprParser.CountContext):
        # TODO - type check 
        l = list(ctx.getChildren())
        name = l[1].getText()
        value = self.current_scope[name]
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
            list_values = self.current_scope[l[0].getText()]
        return list_values[index]

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
        return notes_map[l[0].getText()]


    # Visit a parse tree produced by ExprParser#nameval.
    def visitNameval(self, ctx:ExprParser.NamevalContext):
        l = list(ctx.getChildren())
        name = l[0].getText()
        return self.current_scope[name]


    # Visit a parse tree produced by ExprParser#equals.
    def visitEquals(self, ctx:ExprParser.EqualsContext):
        l = list(ctx.getChildren())
        val = 1 if self.visit(l[0]) == self.visit(l[2])  else 0
        return val


    # Visit a parse tree produced by ExprParser#listval.
    def visitListval(self, ctx:ExprParser.ListvalContext):
        l = list(ctx.getChildren())
        values = map(lambda child: self.visit(child), l[1:-1])
        return list(values)


    # Visit a parse tree produced by ExprParser#power.
    def visitPower(self, ctx:ExprParser.PowerContext):
        l = list(ctx.getChildren())
        return self.visit(l[0]) ** self.visit(l[2])


    # Visit a parse tree produced by ExprParser#bracketed.
    def visitBracketed(self, ctx:ExprParser.BracketedContext):
        l = list(ctx.getChildren())
        return self.visit(l[1])