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
    while note < C8 |:
        (:) note
        note <- note + 1
    :|
:|
All_Keys
"""

code2 = """
n <- 10
if n > 0 |:
:|
"""

code3 = """
src <- {C D E F G}
dst <- {}
aux <- {}
len <- #src
"""

code4 = """
src <- {C2 D2 E2 F2 G2}
"""

code5 = """
HanoiRec n, src, dst, aux |:
    if n > 0 |:
        HanoiRec (n - 1), src, aux, dst
        note <- src[#src]
        8< src[#src]
        dst << note
        (:) note
        HanoiRec (n - 1), aux, dst, src
    :|
:|

src <- {C2 D2}
dst <- {}
aux <- {}
HanoiRec #src, src, dst, aux
"""

code6 = """
HanoiRec n, src, dst, aux |:
    if n > 0 |:
        HanoiRec (n - 1), src, aux, dst
        note <- src[#src]
        8< src[#src]
        dst << note
        (:) note
        HanoiRec (n - 1), aux, dst, src
    :|
:|

src <- {C2 D2 E2 F2 G2}
dst <- {}
aux <- {}
HanoiRec #src, src, dst, aux
"""

def process(prog):

    input_stream = InputStream(prog)

    lexer = ExprLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = ExprParser(token_stream)
    tree = parser.root()

    visitor = EvalVisitor()
    visitor.visit(tree)

    print("Notes: " + str(visitor._notes))
    print("--------------------\n\n")


#process(code0)
#process(code1)
#process(code2)
#process(code3)
#process(code4)
#process(code5)
process(code6)

