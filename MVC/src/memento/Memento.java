package memento;

import code.IOperacio;

/**
 *
 * @author mblan
 */
public class Memento {
    
    public IOperacio operacio;
    
    public Memento(IOperacio operacio){
        
        this.operacio = operacio;
        
    }
    
}
