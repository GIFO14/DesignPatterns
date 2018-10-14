package code;

import java.util.ArrayList;
import java.util.List;
import memento.CareTaker;
import memento.Originator;

/**
 *
 * @author mblan
 */
public class Invoker {
    
    private List<IOperacio> operacions = new ArrayList<>();
    
    private Originator originator = new Originator();
    public CareTaker caretaker = new CareTaker();
    
    public void addOperacio(IOperacio operacio){
        
        operacions.add(operacio);
        
        originator.o = operacio;
        caretaker.addMemento(originator.addMemento());
        
    }
    
    public void executarOperacions(){
        
        operacions.forEach(x -> x.executar());
        operacions.clear();
        
    }
    
    public IOperacio recuperarOperacio(int i){
        
        originator.Restablir(caretaker.catchMemento(i).operacio);
        
        return originator.o;
    }
    
}
