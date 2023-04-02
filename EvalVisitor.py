if __name__ is not None and "." in __name__:
    from .ExprParser import ExprParser
    from .ExprVisitor import ExprVisitor
else:
    from ExprParser import ExprParser
    from ExprVisitor import ExprVisitor
    
    
    
class EvalVisitor(ExprVisitor):

    def __init__(self):
        self._varMap = {}
    
    def visitRoot(self,ctx):
        l = list(ctx.getChildren())
        for child in l:
            self.visit(child)
   
    def visitPower(self, ctx:ExprParser.PowerContext):
        l = list(ctx.getChildren())
        return self.visit(l[0]) ** self.visit(l[2])
    
    def visitDiv(self, ctx:ExprParser.DivContext):
        l = list(ctx.getChildren())
        return self.visit(l[0]) / self.visit(l[2])

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


    # Visit a parse tree produced by ExprParser#num.
    def visitNum(self, ctx:ExprParser.NumContext):
        l = list(ctx.getChildren())
        return int(l[0].getText())

    def visitNameval(self, ctx:ExprParser.NamevalContext):
        l = list(ctx.getChildren())
        name = l[0].getText()
        return self._varMap[name]
        
    def visitNext(self, ctx:ExprParser.NextContext):
        l = list(ctx.getChildren())
        val = self.visit(l[1])
        print("next", val + 1)


    def visitWhileloop(self, ctx:ExprParser.WhileloopContext):
        #WHILE boolexpr action+ #whileloop
        l = list(ctx.getChildren())
        children = l[2:]
        def shouldLoop():
            val = self.visit(l[1])
            return val 
        while shouldLoop():
             for child in children:
                self.visit(child)

    def visitSetequals(self, ctx:ExprParser.SetequalsContext):
        l = list(ctx.getChildren())
        name = l[0].getText()
        value = self.visit(l[2])
        self._varMap[name] = value
        
    
    def visitWrite(self, ctx:ExprParser.WriteContext):
        l = list(ctx.getChildren())
        name = l[1].getText()
        print(self._varMap[name])
        

    def visitIf(self, ctx:ExprParser.IfContext):
        l = list(ctx.getChildren())
        boolVal = self.visit(l[1])
        if boolVal:
            for child in l[2:]:
                self.visit(child)

    def visitIfelse(self, ctx:ExprParser.IfelseContext):
        l = list(ctx.getChildren())
        boolVal = self.visit(l[1])
        text = list(map(lambda x : x.getText(), l))
        indexOfElse = text.index("else")
        if boolVal:
            for child in l[2:indexOfElse]:
                self.visit(child)
        else:
            for child in l[indexOfElse + 1:]:
                self.visit(child)

    def visitBoolexpr(self, ctx:ExprParser.BoolexprContext):
        l = list(ctx.getChildren())
        val0 = self.visit(l[0])
        val2 = self.visit(l[2])
        lessThan = l[1].getText() == '<'
        return val0 < val2 if lessThan else val0 > val2

        
        
        