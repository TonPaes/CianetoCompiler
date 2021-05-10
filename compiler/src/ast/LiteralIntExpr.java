// Nome : Washington Paes Marques da Silva 
// RA: 620190

package ast;

public class LiteralIntExpr extends Expr {
    
    public LiteralIntExpr( int value ) { 
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    public void genC( PW pw, boolean putParenthesis ) {
        pw.printIdent("" + value);
    }
    
    public Type getType() {
        return Type.intType;
    }
    
    private int value;
}
