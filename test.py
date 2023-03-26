from antlr4 import *
from ExprLexer import ExprLexer

from ExprParser import ExprParser
from EvalVisitor import EvalVisitor

code = """
a := 101
write a
"""

input_stream = InputStream(code)

lexer = ExprLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = ExprParser(token_stream)
tree = parser.root()

visitor = EvalVisitor()
visitor.visit(tree)

