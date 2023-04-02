from antlr4 import *
from ExprLexer import ExprLexer

from ExprParser import ExprParser
from EvalVisitor import EvalVisitor

code = """a := 439 + 3 ^ 2 ^ 3
b := 8
c := 1
write a
if 900 < 7000
write a
write b
else
write c
write c
write c
"""

input_stream = InputStream(code)

lexer = ExprLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = ExprParser(token_stream)
tree = parser.root()

visitor = EvalVisitor()
visitor.visit(tree)

