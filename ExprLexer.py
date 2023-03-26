# Generated from Expr.g by ANTLR 4.12.0
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,6,30,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,
        0,4,0,15,8,0,11,0,12,0,16,1,1,1,1,1,2,1,2,1,3,1,3,1,4,1,4,1,5,1,
        5,1,5,1,5,0,0,6,1,1,3,2,5,3,7,4,9,5,11,6,1,0,2,1,0,48,57,2,0,10,
        10,32,32,30,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,
        1,0,0,0,0,11,1,0,0,0,1,14,1,0,0,0,3,18,1,0,0,0,5,20,1,0,0,0,7,22,
        1,0,0,0,9,24,1,0,0,0,11,26,1,0,0,0,13,15,7,0,0,0,14,13,1,0,0,0,15,
        16,1,0,0,0,16,14,1,0,0,0,16,17,1,0,0,0,17,2,1,0,0,0,18,19,5,43,0,
        0,19,4,1,0,0,0,20,21,5,45,0,0,21,6,1,0,0,0,22,23,5,47,0,0,23,8,1,
        0,0,0,24,25,5,42,0,0,25,10,1,0,0,0,26,27,7,1,0,0,27,28,1,0,0,0,28,
        29,6,5,0,0,29,12,1,0,0,0,2,0,16,1,6,0,0
    ]

class ExprLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    NUM = 1
    PLUS = 2
    SUB = 3
    DIV = 4
    MULT = 5
    WS = 6

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'+'", "'-'", "'/'", "'*'" ]

    symbolicNames = [ "<INVALID>",
            "NUM", "PLUS", "SUB", "DIV", "MULT", "WS" ]

    ruleNames = [ "NUM", "PLUS", "SUB", "DIV", "MULT", "WS" ]

    grammarFileName = "Expr.g"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.12.0")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


