package memento;

import App.Controller;
import App.Vista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mblan
 */
public class CareTaker {
    
    private List<Memento> mementos = new ArrayList<>();
    
    public void addMemento(Memento m){
        
        mementos.add(m);
        
    }
    
    public Memento catchMemento(int i){
        
        try{
            
            return mementos.get(i);
            
        }catch(Exception e){
            
            System.out.println("No existeix aquesta operació, torna-ho a probar: ");
            
            Vista v = new Vista();
            Controller c = new Controller();
            
            v.preguntarRecuperacioOperacio();
            if (v.check1) {

                c.recuperarOperacio(v.index);

            }
            
        }
        
        return null;
    }
    
    public void clearList(){
        
        mementos.clear();
        
    }
    
}
