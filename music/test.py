from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from EvalVisitor import EvalVisitor
import os

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
    <w> n src dst aux
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

code7 = """
<w> "Their GCD is"
"""

code8 = """
Euclides a, b |:
:|
"""

code9 = """
Euclides a, b |:
    while a /= b |:
        if a > b |:
            (:) C2
            a <- a - b
        :|
        else |:
            (:) C4
            b <- b - a
        :|
    :|
    <w> "Their GCD is" a
:|
Euclides 150, 28
"""

code10 = """
(:) C2
(:) C2
(:) C2
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
    return visitor._notes


def write_lilypond(notes):
    newNotes = list(map(lambda n: n.lower()[0] + "'" + n.lower()[1], notes))
    newNotes = " ".join(newNotes)
    path = os.path.dirname(os.path.abspath(__file__))
    path += "/music.lily"
    file = open(path, "w+")
    file.write('\\version "2.20.0"\n')
    file.write('\\score {\n')
    file.write('\t\\absolute {\n')
    file.write('\t\t\\tempo 4 = 120\n')
    file.write('\t\t' + newNotes + '\n')
    file.write('\t}\n')
    file.write('\t\\layout { }\n')
    file.write('\t\\midi { }\n')
    file.write('}\n')
    file.close()
    os.system("lilypond music.lily")

#process(code0)
#process(code1)
#process(code2)
#process(code3)
#process(code4)
#process(code5)
#process(code6)
#process(code7)
#process(code8)
#process(code9)
notes = process(code6)
write_lilypond(notes)


