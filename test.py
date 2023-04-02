from antlr4 import *
from ExprLexer import ExprLexer

from ExprParser import ExprParser
from EvalVisitor import EvalVisitor

code = """a := 90
b := 8
c := 1
write a
write b
write c
while c <= a
write c
write a  
c := c * 2
a := a - 1
"""

input_stream = InputStream(code)

lexer = ExprLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = ExprParser(token_stream)
tree = parser.root()

visitor = EvalVisitor()
visitor.visit(tree)

