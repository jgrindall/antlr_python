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
        4,0,9,50,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,1,0,4,0,21,8,0,11,0,12,0,22,1,1,1,1,1,2,1,
        2,1,3,1,3,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,5,1,6,4,6,40,8,6,11,6,12,
        6,41,1,7,1,7,1,7,1,8,1,8,1,8,1,8,0,0,9,1,1,3,2,5,3,7,4,9,5,11,6,
        13,7,15,8,17,9,1,0,3,1,0,48,57,1,0,97,122,2,0,10,10,32,32,51,0,1,
        1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,
        0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,1,20,1,0,0,0,3,24,1,0,
        0,0,5,26,1,0,0,0,7,28,1,0,0,0,9,30,1,0,0,0,11,32,1,0,0,0,13,39,1,
        0,0,0,15,43,1,0,0,0,17,46,1,0,0,0,19,21,7,0,0,0,20,19,1,0,0,0,21,
        22,1,0,0,0,22,20,1,0,0,0,22,23,1,0,0,0,23,2,1,0,0,0,24,25,5,43,0,
        0,25,4,1,0,0,0,26,27,5,45,0,0,27,6,1,0,0,0,28,29,5,47,0,0,29,8,1,
        0,0,0,30,31,5,42,0,0,31,10,1,0,0,0,32,33,5,119,0,0,33,34,5,114,0,
        0,34,35,5,105,0,0,35,36,5,116,0,0,36,37,5,101,0,0,37,12,1,0,0,0,
        38,40,7,1,0,0,39,38,1,0,0,0,40,41,1,0,0,0,41,39,1,0,0,0,41,42,1,
        0,0,0,42,14,1,0,0,0,43,44,5,58,0,0,44,45,5,61,0,0,45,16,1,0,0,0,
        46,47,7,2,0,0,47,48,1,0,0,0,48,49,6,8,0,0,49,18,1,0,0,0,3,0,22,41,
        1,6,0,0
    ]

class ExprLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    NUM = 1
    PLUS = 2
    SUB = 3
    DIV = 4
    MULT = 5
    WRITE = 6
    NAME = 7
    SETEQUALS = 8
    WS = 9

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'+'", "'-'", "'/'", "'*'", "'write'", "':='" ]

    symbolicNames = [ "<INVALID>",
            "NUM", "PLUS", "SUB", "DIV", "MULT", "WRITE", "NAME", "SETEQUALS", 
            "WS" ]

    ruleNames = [ "NUM", "PLUS", "SUB", "DIV", "MULT", "WRITE", "NAME", 
                  "SETEQUALS", "WS" ]

    grammarFileName = "Expr.g"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.12.0")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


