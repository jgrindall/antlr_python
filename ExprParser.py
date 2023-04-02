# Generated from Expr.g by ANTLR 4.12.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,17,91,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,4,0,10,8,0,11,0,12,
        0,11,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,1,26,8,1,
        11,1,12,1,27,1,1,1,1,1,1,4,1,33,8,1,11,1,12,1,34,1,1,1,1,4,1,39,
        8,1,11,1,12,1,40,1,1,1,1,1,1,4,1,46,8,1,11,1,12,1,47,3,1,50,8,1,
        1,2,1,2,1,2,3,2,55,8,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
        2,1,2,1,2,1,2,1,2,5,2,72,8,2,10,2,12,2,75,9,2,1,3,1,3,1,3,1,3,1,
        3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,3,3,89,8,3,1,3,0,1,4,4,0,2,4,6,0,0,
        104,0,9,1,0,0,0,2,49,1,0,0,0,4,54,1,0,0,0,6,88,1,0,0,0,8,10,3,2,
        1,0,9,8,1,0,0,0,10,11,1,0,0,0,11,9,1,0,0,0,11,12,1,0,0,0,12,13,1,
        0,0,0,13,14,5,0,0,1,14,1,1,0,0,0,15,16,5,14,0,0,16,50,3,4,2,0,17,
        18,5,4,0,0,18,50,3,4,2,0,19,20,5,15,0,0,20,21,5,16,0,0,21,50,3,4,
        2,0,22,23,5,6,0,0,23,25,3,6,3,0,24,26,3,2,1,0,25,24,1,0,0,0,26,27,
        1,0,0,0,27,25,1,0,0,0,27,28,1,0,0,0,28,50,1,0,0,0,29,30,5,6,0,0,
        30,32,3,6,3,0,31,33,3,2,1,0,32,31,1,0,0,0,33,34,1,0,0,0,34,32,1,
        0,0,0,34,35,1,0,0,0,35,36,1,0,0,0,36,38,5,7,0,0,37,39,3,2,1,0,38,
        37,1,0,0,0,39,40,1,0,0,0,40,38,1,0,0,0,40,41,1,0,0,0,41,50,1,0,0,
        0,42,43,5,2,0,0,43,45,3,6,3,0,44,46,3,2,1,0,45,44,1,0,0,0,46,47,
        1,0,0,0,47,45,1,0,0,0,47,48,1,0,0,0,48,50,1,0,0,0,49,15,1,0,0,0,
        49,17,1,0,0,0,49,19,1,0,0,0,49,22,1,0,0,0,49,29,1,0,0,0,49,42,1,
        0,0,0,50,3,1,0,0,0,51,52,6,2,-1,0,52,55,5,15,0,0,53,55,5,8,0,0,54,
        51,1,0,0,0,54,53,1,0,0,0,55,73,1,0,0,0,56,57,10,7,0,0,57,58,5,11,
        0,0,58,72,3,4,2,7,59,60,10,6,0,0,60,61,5,12,0,0,61,72,3,4,2,7,62,
        63,10,5,0,0,63,64,5,13,0,0,64,72,3,4,2,6,65,66,10,4,0,0,66,67,5,
        9,0,0,67,72,3,4,2,5,68,69,10,3,0,0,69,70,5,10,0,0,70,72,3,4,2,4,
        71,56,1,0,0,0,71,59,1,0,0,0,71,62,1,0,0,0,71,65,1,0,0,0,71,68,1,
        0,0,0,72,75,1,0,0,0,73,71,1,0,0,0,73,74,1,0,0,0,74,5,1,0,0,0,75,
        73,1,0,0,0,76,77,3,4,2,0,77,78,5,3,0,0,78,79,3,4,2,0,79,89,1,0,0,
        0,80,81,3,4,2,0,81,82,5,5,0,0,82,83,3,4,2,0,83,89,1,0,0,0,84,85,
        3,4,2,0,85,86,5,1,0,0,86,87,3,4,2,0,87,89,1,0,0,0,88,76,1,0,0,0,
        88,80,1,0,0,0,88,84,1,0,0,0,89,7,1,0,0,0,10,11,27,34,40,47,49,54,
        71,73,88
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'=='", "'while'", "'<'", "'next'", "'>'", 
                     "'if'", "'else'", "<INVALID>", "'+'", "'-'", "'^'", 
                     "'/'", "'*'", "'write'", "<INVALID>", "':='" ]

    symbolicNames = [ "<INVALID>", "EQUALS", "WHILE", "LESS_THAN", "NEXT", 
                      "GREATER_THAN", "IF", "ELSE", "NUM", "PLUS", "SUB", 
                      "POWER", "DIV", "MULT", "WRITE", "NAME", "SETEQUALS", 
                      "WS" ]

    RULE_root = 0
    RULE_action = 1
    RULE_expr = 2
    RULE_boolexpr = 3

    ruleNames =  [ "root", "action", "expr", "boolexpr" ]

    EOF = Token.EOF
    EQUALS=1
    WHILE=2
    LESS_THAN=3
    NEXT=4
    GREATER_THAN=5
    IF=6
    ELSE=7
    NUM=8
    PLUS=9
    SUB=10
    POWER=11
    DIV=12
    MULT=13
    WRITE=14
    NAME=15
    SETEQUALS=16
    WS=17

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.12.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def action(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ActionContext)
            else:
                return self.getTypedRuleContext(ExprParser.ActionContext,i)


        def getRuleIndex(self):
            return ExprParser.RULE_root

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRoot" ):
                return visitor.visitRoot(self)
            else:
                return visitor.visitChildren(self)




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 9 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 8
                self.action()
                self.state = 11 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 49236) != 0)):
                    break

            self.state = 13
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ActionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ExprParser.RULE_action

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class NextContext(ActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ActionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NEXT(self):
            return self.getToken(ExprParser.NEXT, 0)
        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNext" ):
                return visitor.visitNext(self)
            else:
                return visitor.visitChildren(self)


    class WhileloopContext(ActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ActionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def WHILE(self):
            return self.getToken(ExprParser.WHILE, 0)
        def boolexpr(self):
            return self.getTypedRuleContext(ExprParser.BoolexprContext,0)

        def action(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ActionContext)
            else:
                return self.getTypedRuleContext(ExprParser.ActionContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhileloop" ):
                return visitor.visitWhileloop(self)
            else:
                return visitor.visitChildren(self)


    class WriteContext(ActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ActionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def WRITE(self):
            return self.getToken(ExprParser.WRITE, 0)
        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWrite" ):
                return visitor.visitWrite(self)
            else:
                return visitor.visitChildren(self)


    class IfContext(ActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ActionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def IF(self):
            return self.getToken(ExprParser.IF, 0)
        def boolexpr(self):
            return self.getTypedRuleContext(ExprParser.BoolexprContext,0)

        def action(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ActionContext)
            else:
                return self.getTypedRuleContext(ExprParser.ActionContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIf" ):
                return visitor.visitIf(self)
            else:
                return visitor.visitChildren(self)


    class SetequalsContext(ActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ActionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NAME(self):
            return self.getToken(ExprParser.NAME, 0)
        def SETEQUALS(self):
            return self.getToken(ExprParser.SETEQUALS, 0)
        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSetequals" ):
                return visitor.visitSetequals(self)
            else:
                return visitor.visitChildren(self)


    class IfelseContext(ActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ActionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def IF(self):
            return self.getToken(ExprParser.IF, 0)
        def boolexpr(self):
            return self.getTypedRuleContext(ExprParser.BoolexprContext,0)

        def ELSE(self):
            return self.getToken(ExprParser.ELSE, 0)
        def action(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ActionContext)
            else:
                return self.getTypedRuleContext(ExprParser.ActionContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfelse" ):
                return visitor.visitIfelse(self)
            else:
                return visitor.visitChildren(self)



    def action(self):

        localctx = ExprParser.ActionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_action)
        self._la = 0 # Token type
        try:
            self.state = 49
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                localctx = ExprParser.WriteContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 15
                self.match(ExprParser.WRITE)
                self.state = 16
                self.expr(0)
                pass

            elif la_ == 2:
                localctx = ExprParser.NextContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 17
                self.match(ExprParser.NEXT)
                self.state = 18
                self.expr(0)
                pass

            elif la_ == 3:
                localctx = ExprParser.SetequalsContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 19
                self.match(ExprParser.NAME)
                self.state = 20
                self.match(ExprParser.SETEQUALS)
                self.state = 21
                self.expr(0)
                pass

            elif la_ == 4:
                localctx = ExprParser.IfContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 22
                self.match(ExprParser.IF)
                self.state = 23
                self.boolexpr()
                self.state = 25 
                self._errHandler.sync(self)
                _alt = 1
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt == 1:
                        self.state = 24
                        self.action()

                    else:
                        raise NoViableAltException(self)
                    self.state = 27 
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,1,self._ctx)

                pass

            elif la_ == 5:
                localctx = ExprParser.IfelseContext(self, localctx)
                self.enterOuterAlt(localctx, 5)
                self.state = 29
                self.match(ExprParser.IF)
                self.state = 30
                self.boolexpr()
                self.state = 32 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 31
                    self.action()
                    self.state = 34 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 49236) != 0)):
                        break

                self.state = 36
                self.match(ExprParser.ELSE)
                self.state = 38 
                self._errHandler.sync(self)
                _alt = 1
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt == 1:
                        self.state = 37
                        self.action()

                    else:
                        raise NoViableAltException(self)
                    self.state = 40 
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

                pass

            elif la_ == 6:
                localctx = ExprParser.WhileloopContext(self, localctx)
                self.enterOuterAlt(localctx, 6)
                self.state = 42
                self.match(ExprParser.WHILE)
                self.state = 43
                self.boolexpr()
                self.state = 45 
                self._errHandler.sync(self)
                _alt = 1
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt == 1:
                        self.state = 44
                        self.action()

                    else:
                        raise NoViableAltException(self)
                    self.state = 47 
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ExprParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class DivContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ExprContext)
            else:
                return self.getTypedRuleContext(ExprParser.ExprContext,i)

        def DIV(self):
            return self.getToken(ExprParser.DIV, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDiv" ):
                return visitor.visitDiv(self)
            else:
                return visitor.visitChildren(self)


    class AddContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ExprContext)
            else:
                return self.getTypedRuleContext(ExprParser.ExprContext,i)

        def PLUS(self):
            return self.getToken(ExprParser.PLUS, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAdd" ):
                return visitor.visitAdd(self)
            else:
                return visitor.visitChildren(self)


    class SubContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ExprContext)
            else:
                return self.getTypedRuleContext(ExprParser.ExprContext,i)

        def SUB(self):
            return self.getToken(ExprParser.SUB, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSub" ):
                return visitor.visitSub(self)
            else:
                return visitor.visitChildren(self)


    class MultContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ExprContext)
            else:
                return self.getTypedRuleContext(ExprParser.ExprContext,i)

        def MULT(self):
            return self.getToken(ExprParser.MULT, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMult" ):
                return visitor.visitMult(self)
            else:
                return visitor.visitChildren(self)


    class NamevalContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NAME(self):
            return self.getToken(ExprParser.NAME, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNameval" ):
                return visitor.visitNameval(self)
            else:
                return visitor.visitChildren(self)


    class NumContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUM(self):
            return self.getToken(ExprParser.NUM, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNum" ):
                return visitor.visitNum(self)
            else:
                return visitor.visitChildren(self)


    class PowerContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ExprContext)
            else:
                return self.getTypedRuleContext(ExprParser.ExprContext,i)

        def POWER(self):
            return self.getToken(ExprParser.POWER, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPower" ):
                return visitor.visitPower(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = ExprParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 4
        self.enterRecursionRule(localctx, 4, self.RULE_expr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [15]:
                localctx = ExprParser.NamevalContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 52
                self.match(ExprParser.NAME)
                pass
            elif token in [8]:
                localctx = ExprParser.NumContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 53
                self.match(ExprParser.NUM)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 73
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,8,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 71
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
                    if la_ == 1:
                        localctx = ExprParser.PowerContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 56
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 57
                        self.match(ExprParser.POWER)
                        self.state = 58
                        self.expr(7)
                        pass

                    elif la_ == 2:
                        localctx = ExprParser.DivContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 59
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 60
                        self.match(ExprParser.DIV)
                        self.state = 61
                        self.expr(7)
                        pass

                    elif la_ == 3:
                        localctx = ExprParser.MultContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 62
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 63
                        self.match(ExprParser.MULT)
                        self.state = 64
                        self.expr(6)
                        pass

                    elif la_ == 4:
                        localctx = ExprParser.AddContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 65
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 66
                        self.match(ExprParser.PLUS)
                        self.state = 67
                        self.expr(5)
                        pass

                    elif la_ == 5:
                        localctx = ExprParser.SubContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 68
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 69
                        self.match(ExprParser.SUB)
                        self.state = 70
                        self.expr(4)
                        pass

             
                self.state = 75
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,8,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class BoolexprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ExprContext)
            else:
                return self.getTypedRuleContext(ExprParser.ExprContext,i)


        def LESS_THAN(self):
            return self.getToken(ExprParser.LESS_THAN, 0)

        def GREATER_THAN(self):
            return self.getToken(ExprParser.GREATER_THAN, 0)

        def EQUALS(self):
            return self.getToken(ExprParser.EQUALS, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_boolexpr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBoolexpr" ):
                return visitor.visitBoolexpr(self)
            else:
                return visitor.visitChildren(self)




    def boolexpr(self):

        localctx = ExprParser.BoolexprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_boolexpr)
        try:
            self.state = 88
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 76
                self.expr(0)
                self.state = 77
                self.match(ExprParser.LESS_THAN)
                self.state = 78
                self.expr(0)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 80
                self.expr(0)
                self.state = 81
                self.match(ExprParser.GREATER_THAN)
                self.state = 82
                self.expr(0)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 84
                self.expr(0)
                self.state = 85
                self.match(ExprParser.EQUALS)
                self.state = 86
                self.expr(0)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[2] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 7)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 6)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 4:
                return self.precpred(self._ctx, 3)
         




