package libraries;

/**
 *
 * @author mblan
 */
public class Originator {
    
    public Joc estat;
    
    public Memento Guardar(){
        
        return new Memento(estat);
    }
    
    public void Restablir(Memento m){
        
        this.estat = m.estat;
        
    }
    
}
