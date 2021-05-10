// Nome : Washington Paes Marques da Silva 
// RA: 620190

package ast;

public class TypeString extends Type {
    
    public TypeString() {
        super("String");
    }
    
   public String getCname() {
      return "char *";
   }

}