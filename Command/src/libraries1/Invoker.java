package libraries1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mblan
 */
public class Invoker {
   
    private List<IOperacio> operacions = new ArrayList<>();
    
    public void rebreOperacio(IOperacio operacio){
        
        this.operacions.add(operacio);
        
    }
    
    public void executarOperacio(){
        
        this.operacions.forEach(x -> x.executar());
        this.operacions.clear();
        
    }
    
}
