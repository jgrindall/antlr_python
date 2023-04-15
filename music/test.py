from antlr4 import *
from ExprLexer import ExprLexer

from ExprParser import ExprParser
from EvalVisitor import EvalVisitor

code0 = """
All_Keys |:
    note <- A0
:|
"""

code1 = """
All_Keys |:
    note <- A0
    while note <= C8 |:
        <:> note
        note <- note + 1
    :|
:|
"""

code2 = """
HanoiRec n src dst aux |:
    if n > 0 |:
        HanoiRec (n - 1) src aux dst
        note <- src[#src]
        8< src[#src]
        dst << note
        (:) note
        HanoiRec (n - 1) aux dst src
    :|
:|

src <- {C D E F G}
dst <- {}
aux <- {}
HanoiRec #src src dst aux

"""

def process(prog):

    input_stream = InputStream(code0)

    lexer = ExprLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = ExprParser(token_stream)
    tree = parser.root()

    visitor = EvalVisitor()
    visitor.visit(tree)

    print("Notes: " + str(visitor._notes))


process(code0)
process(code1)
process(code2)
