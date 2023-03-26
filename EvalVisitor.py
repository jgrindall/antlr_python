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
        
    def visitSetequals(self, ctx:ExprParser.SetequalsContext):
        l = list(ctx.getChildren())
        name = l[0].getText()
        value = self.visit(l[2])
        self._varMap[name] = value
        
    
    def visitWrite(self, ctx:ExprParser.WriteContext):
        l = list(ctx.getChildren())
        name = l[1].getText()
        print(self._varMap[name])
        
        
        
        