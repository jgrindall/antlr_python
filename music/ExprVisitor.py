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


    # Visit a parse tree produced by ExprParser#proc_def.
    def visitProc_def(self, ctx:ExprParser.Proc_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#proc_call.
    def visitProc_call(self, ctx:ExprParser.Proc_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#expr_list.
    def visitExpr_list(self, ctx:ExprParser.Expr_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#args_list.
    def visitArgs_list(self, ctx:ExprParser.Args_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#instructions.
    def visitInstructions(self, ctx:ExprParser.InstructionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#instruction.
    def visitInstruction(self, ctx:ExprParser.InstructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#assign.
    def visitAssign(self, ctx:ExprParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#input.
    def visitInput(self, ctx:ExprParser.InputContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#output.
    def visitOutput(self, ctx:ExprParser.OutputContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#play.
    def visitPlay(self, ctx:ExprParser.PlayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#if_else.
    def visitIf_else(self, ctx:ExprParser.If_elseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#while_.
    def visitWhile_(self, ctx:ExprParser.While_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#append.
    def visitAppend(self, ctx:ExprParser.AppendContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#cut.
    def visitCut(self, ctx:ExprParser.CutContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#list_.
    def visitList_(self, ctx:ExprParser.List_Context):
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


    # Visit a parse tree produced by ExprParser#string.
    def visitString(self, ctx:ExprParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#num.
    def visitNum(self, ctx:ExprParser.NumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#count.
    def visitCount(self, ctx:ExprParser.CountContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#lt.
    def visitLt(self, ctx:ExprParser.LtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#index.
    def visitIndex(self, ctx:ExprParser.IndexContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#gt.
    def visitGt(self, ctx:ExprParser.GtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#div.
    def visitDiv(self, ctx:ExprParser.DivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#notename.
    def visitNotename(self, ctx:ExprParser.NotenameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#nameval.
    def visitNameval(self, ctx:ExprParser.NamevalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#equals.
    def visitEquals(self, ctx:ExprParser.EqualsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#isnotequals.
    def visitIsnotequals(self, ctx:ExprParser.IsnotequalsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#isequals.
    def visitIsequals(self, ctx:ExprParser.IsequalsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#listval.
    def visitListval(self, ctx:ExprParser.ListvalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#power.
    def visitPower(self, ctx:ExprParser.PowerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#bracketed.
    def visitBracketed(self, ctx:ExprParser.BracketedContext):
        return self.visitChildren(ctx)



del ExprParser