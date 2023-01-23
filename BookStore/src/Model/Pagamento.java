
package Model;

import java.util.*;

public class Pagamento {
    
    private String metodo;

   public Pagamento(String metodo){
      super();
      this.metodo = metodo;

   }
    
        
    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    
    
}
