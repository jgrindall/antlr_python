# Generated from Expr.g by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete generic visitor for a parse tree produced by ExprParser.

class ExprVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ExprParser#root.
    def visitRoot(self, ctx:ExprParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#div.
    def visitDiv(self, ctx:ExprParser.DivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#add.
    def visitAdd(self, ctx:ExprParser.AddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#sub.
    def visitSub(self, ctx:ExprParser.SubContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#mult.
    def visitMult(self, ctx:ExprParser.MultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#num.
    def visitNum(self, ctx:ExprParser.NumContext):
        return self.visitChildren(ctx)



del ExprParser