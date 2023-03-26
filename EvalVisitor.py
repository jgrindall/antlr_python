if __name__ is not None and "." in __name__:
    from .ExprParser import ExprParser
    from .ExprVisitor import ExprVisitor
else:
    from ExprParser import ExprParser
    from ExprVisitor import ExprVisitor
    
    
    
class EvalVisitor(ExprVisitor):
    
    def visitRoot(self,ctx):
        l = list(ctx.getChildren())
        print(self.visit(l[0]))
   
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
        
        