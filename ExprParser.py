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
        4,1,14,76,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,4,0,10,8,0,11,0,12,
        0,11,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,1,24,8,1,11,1,12,
        1,25,1,1,1,1,1,1,4,1,31,8,1,11,1,12,1,32,1,1,1,1,4,1,37,8,1,11,1,
        12,1,38,3,1,41,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
        2,1,2,1,2,1,2,1,2,1,2,1,2,5,2,61,8,2,10,2,12,2,64,9,2,1,3,1,3,1,
        3,1,3,1,3,1,3,1,3,1,3,3,3,74,8,3,1,3,0,1,4,4,0,2,4,6,0,0,84,0,9,
        1,0,0,0,2,40,1,0,0,0,4,42,1,0,0,0,6,73,1,0,0,0,8,10,3,2,1,0,9,8,
        1,0,0,0,10,11,1,0,0,0,11,9,1,0,0,0,11,12,1,0,0,0,12,13,1,0,0,0,13,
        14,5,0,0,1,14,1,1,0,0,0,15,16,5,11,0,0,16,41,5,12,0,0,17,18,5,12,
        0,0,18,19,5,13,0,0,19,41,3,4,2,0,20,21,5,3,0,0,21,23,3,6,3,0,22,
        24,3,2,1,0,23,22,1,0,0,0,24,25,1,0,0,0,25,23,1,0,0,0,25,26,1,0,0,
        0,26,41,1,0,0,0,27,28,5,3,0,0,28,30,3,6,3,0,29,31,3,2,1,0,30,29,
        1,0,0,0,31,32,1,0,0,0,32,30,1,0,0,0,32,33,1,0,0,0,33,34,1,0,0,0,
        34,36,5,4,0,0,35,37,3,2,1,0,36,35,1,0,0,0,37,38,1,0,0,0,38,36,1,
        0,0,0,38,39,1,0,0,0,39,41,1,0,0,0,40,15,1,0,0,0,40,17,1,0,0,0,40,
        20,1,0,0,0,40,27,1,0,0,0,41,3,1,0,0,0,42,43,6,2,-1,0,43,44,5,5,0,
        0,44,62,1,0,0,0,45,46,10,6,0,0,46,47,5,8,0,0,47,61,3,4,2,6,48,49,
        10,5,0,0,49,50,5,9,0,0,50,61,3,4,2,6,51,52,10,4,0,0,52,53,5,10,0,
        0,53,61,3,4,2,5,54,55,10,3,0,0,55,56,5,6,0,0,56,61,3,4,2,4,57,58,
        10,2,0,0,58,59,5,7,0,0,59,61,3,4,2,3,60,45,1,0,0,0,60,48,1,0,0,0,
        60,51,1,0,0,0,60,54,1,0,0,0,60,57,1,0,0,0,61,64,1,0,0,0,62,60,1,
        0,0,0,62,63,1,0,0,0,63,5,1,0,0,0,64,62,1,0,0,0,65,66,3,4,2,0,66,
        67,5,1,0,0,67,68,3,4,2,0,68,74,1,0,0,0,69,70,3,4,2,0,70,71,5,2,0,
        0,71,72,3,4,2,0,72,74,1,0,0,0,73,65,1,0,0,0,73,69,1,0,0,0,74,7,1,
        0,0,0,8,11,25,32,38,40,60,62,73
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'<'", "'>'", "'if'", "'else'", "<INVALID>", 
                     "'+'", "'-'", "'^'", "'/'", "'*'", "'write'", "<INVALID>", 
                     "':='" ]

    symbolicNames = [ "<INVALID>", "LESS_THAN", "GREATER_THAN", "IF", "ELSE", 
                      "NUM", "PLUS", "SUB", "POWER", "DIV", "MULT", "WRITE", 
                      "NAME", "SETEQUALS", "WS" ]

    RULE_root = 0
    RULE_action = 1
    RULE_expr = 2
    RULE_boolexpr = 3

    ruleNames =  [ "root", "action", "expr", "boolexpr" ]

    EOF = Token.EOF
    LESS_THAN=1
    GREATER_THAN=2
    IF=3
    ELSE=4
    NUM=5
    PLUS=6
    SUB=7
    POWER=8
    DIV=9
    MULT=10
    WRITE=11
    NAME=12
    SETEQUALS=13
    WS=14

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
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 6152) != 0)):
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
            self.state = 40
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                localctx = ExprParser.WriteContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 15
                self.match(ExprParser.WRITE)
                self.state = 16
                self.match(ExprParser.NAME)
                pass

            elif la_ == 2:
                localctx = ExprParser.SetequalsContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 17
                self.match(ExprParser.NAME)
                self.state = 18
                self.match(ExprParser.SETEQUALS)
                self.state = 19
                self.expr(0)
                pass

            elif la_ == 3:
                localctx = ExprParser.IfContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 20
                self.match(ExprParser.IF)
                self.state = 21
                self.boolexpr()
                self.state = 23 
                self._errHandler.sync(self)
                _alt = 1
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt == 1:
                        self.state = 22
                        self.action()

                    else:
                        raise NoViableAltException(self)
                    self.state = 25 
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,1,self._ctx)

                pass

            elif la_ == 4:
                localctx = ExprParser.IfelseContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 27
                self.match(ExprParser.IF)
                self.state = 28
                self.boolexpr()
                self.state = 30 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 29
                    self.action()
                    self.state = 32 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 6152) != 0)):
                        break

                self.state = 34
                self.match(ExprParser.ELSE)
                self.state = 36 
                self._errHandler.sync(self)
                _alt = 1
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt == 1:
                        self.state = 35
                        self.action()

                    else:
                        raise NoViableAltException(self)
                    self.state = 38 
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

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
            localctx = ExprParser.NumContext(self, localctx)
            self._ctx = localctx
            _prevctx = localctx

            self.state = 43
            self.match(ExprParser.NUM)
            self._ctx.stop = self._input.LT(-1)
            self.state = 62
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,6,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 60
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
                    if la_ == 1:
                        localctx = ExprParser.PowerContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 45
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 46
                        self.match(ExprParser.POWER)
                        self.state = 47
                        self.expr(6)
                        pass

                    elif la_ == 2:
                        localctx = ExprParser.DivContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 48
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 49
                        self.match(ExprParser.DIV)
                        self.state = 50
                        self.expr(6)
                        pass

                    elif la_ == 3:
                        localctx = ExprParser.MultContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 51
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 52
                        self.match(ExprParser.MULT)
                        self.state = 53
                        self.expr(5)
                        pass

                    elif la_ == 4:
                        localctx = ExprParser.AddContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 54
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 55
                        self.match(ExprParser.PLUS)
                        self.state = 56
                        self.expr(4)
                        pass

                    elif la_ == 5:
                        localctx = ExprParser.SubContext(self, ExprParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 57
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 58
                        self.match(ExprParser.SUB)
                        self.state = 59
                        self.expr(3)
                        pass

             
                self.state = 64
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,6,self._ctx)

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
            self.state = 73
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 65
                self.expr(0)
                self.state = 66
                self.match(ExprParser.LESS_THAN)
                self.state = 67
                self.expr(0)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 69
                self.expr(0)
                self.state = 70
                self.match(ExprParser.GREATER_THAN)
                self.state = 71
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
                return self.precpred(self._ctx, 6)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 4:
                return self.precpred(self._ctx, 2)
         




