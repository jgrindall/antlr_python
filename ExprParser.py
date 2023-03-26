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
        4,1,9,41,2,0,7,0,2,1,7,1,2,2,7,2,1,0,4,0,8,8,0,11,0,12,0,9,1,0,1,
        0,1,1,1,1,1,1,1,1,1,1,3,1,19,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,
        1,2,1,2,1,2,1,2,1,2,1,2,1,2,5,2,36,8,2,10,2,12,2,39,9,2,1,2,0,1,
        4,3,0,2,4,0,0,43,0,7,1,0,0,0,2,18,1,0,0,0,4,20,1,0,0,0,6,8,3,2,1,
        0,7,6,1,0,0,0,8,9,1,0,0,0,9,7,1,0,0,0,9,10,1,0,0,0,10,11,1,0,0,0,
        11,12,5,0,0,1,12,1,1,0,0,0,13,14,5,6,0,0,14,19,5,7,0,0,15,16,5,7,
        0,0,16,17,5,8,0,0,17,19,3,4,2,0,18,13,1,0,0,0,18,15,1,0,0,0,19,3,
        1,0,0,0,20,21,6,2,-1,0,21,22,5,1,0,0,22,37,1,0,0,0,23,24,10,5,0,
        0,24,25,5,4,0,0,25,36,3,4,2,6,26,27,10,4,0,0,27,28,5,5,0,0,28,36,
        3,4,2,5,29,30,10,3,0,0,30,31,5,2,0,0,31,36,3,4,2,4,32,33,10,2,0,
        0,33,34,5,3,0,0,34,36,3,4,2,3,35,23,1,0,0,0,35,26,1,0,0,0,35,29,
        1,0,0,0,35,32,1,0,0,0,36,39,1,0,0,0,37,35,1,0,0,0,37,38,1,0,0,0,
        38,5,1,0,0,0,39,37,1,0,0,0,4,9,18,35,37
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "'+'", "'-'", "'/'", "'*'", 
                     "'write'", "<INVALID>", "':='" ]

    symbolicNames = [ "<INVALID>", "NUM", "PLUS", "SUB", "DIV", "MULT", 
                      "WRITE", "NAME", "SETEQUALS", "WS" ]

    RULE_root = 0
    RULE_action = 1
    RULE_expr = 2

    ruleNames =  [ "root", "action", "expr" ]

    EOF = Token.EOF
    NUM=1
    PLUS=2
    SUB=3
    DIV=4
    MULT=5
    WRITE=6
    NAME=7
    SETEQUALS=8
    WS=9

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
            self.state = 7 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 6
                self.action()
                self.state = 9 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==6 or _la==7):
                    break

            self.state = 11
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



    class WriteContext(ActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.ActionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def WRITE(self):
            return self.getToken(ExprParser.WRITE, 0)
        def NAME(self):
            return self.getToken(ExprParser.NAME, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWrite" ):
                return visitor.visitWrite(self)
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



    def action(self):

        localctx = ExprParser.ActionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_action)
        try:
            self.state = 18
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6]:
                localctx = ExprParser.WriteContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 13
                self.match(ExprParser.WRITE)
                self.state = 14
                self.match(ExprParser.NAME)
                pass
            elif token in [7]:
                localctx = ExprParser.SetequalsContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 15
                self.match(ExprParser.NAME)
                self.state = 16
                self.match(ExprParser.SETEQUALS)
                self.state = 17
                self.expr(0)
                pass
            else:
                raise NoViableAltException(self)

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



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = ExprParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 4
        self.enterRecursionRule(localctx, 4, self.RULE_expr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            localctx = ExprParser.NumContext(self, localctx)
            self._ctx = localctx
            _prevctx = localctx

            self.state = 21
            self.match(ExprParser.NUM)
            self._ctx.stop = self._input.LT(-1)
            self.state = 37
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 35
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                    if la_ == 1:
                        localctx = ExprParser.DivContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 23
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 24
                        self.match(ExprParser.DIV)
                        self.state = 25
                        self.expr(6)
                        pass

                    elif la_ == 2:
                        localctx = ExprParser.MultContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 26
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 27
                        self.match(ExprParser.MULT)
                        self.state = 28
                        self.expr(5)
                        pass

                    elif la_ == 3:
                        localctx = ExprParser.AddContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 29
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 30
                        self.match(ExprParser.PLUS)
                        self.state = 31
                        self.expr(4)
                        pass

                    elif la_ == 4:
                        localctx = ExprParser.SubContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 32
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 33
                        self.match(ExprParser.SUB)
                        self.state = 34
                        self.expr(3)
                        pass

             
                self.state = 39
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
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
                return self.precpred(self._ctx, 5)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 2)
         




