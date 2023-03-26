if __name__ is not None and "." in __name__:
    from .ExprParser import ExprParser
    from .ExprVisitor import ExprVisitor
else:
    from ExprParser import ExprParser
    from ExprVisitor import ExprVisitor


class ElementalVisitor(ExprVisitor):
    
    def visitRoot(self,ctx):
        l = list(ctx.getChildren())
        print(self.visit(l[0]))
        
    def visitExpr(self,ctx):
        l = list(ctx.getChildren())
        if len(l) == 1: #NUM
            return int(l[0].getText())
        else: #len(l) == 3
            if l[1].getText() == '+':
                return self.visit(l[0]) + self.visit(l[2])
            else:
                return self.visit(l[0]) - self.visit(l[2])
            
            
            
        
                
            
        
        
        
        
