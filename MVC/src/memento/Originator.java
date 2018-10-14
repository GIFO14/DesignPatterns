package memento;

import code.IOperacio;

/**
 *
 * @author mblan
 */
public class Originator {
    
    public IOperacio o;
    
    public Memento addMemento(){
        
        return new Memento(o);
    }
    
    public void Restablir(IOperacio operacio){
        
        o = operacio;
        
    }
    
}
