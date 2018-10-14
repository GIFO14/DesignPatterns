package libraries;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mblan
 */
public class Subject {
    
    private List<Observer> observers = new ArrayList<Observer>();
    public int estat;
    
    public void setEstat(int estat){
        
        this.estat = estat;
        notificarTotsObservers();
        
    }
    
    public void agregar(Observer obsever){
        
        observers.add(obsever);
        
    }
    
    public void notificarTotsObservers(){
        
        observers.forEach(x -> x.actualitzar());
        
    }
    
}
