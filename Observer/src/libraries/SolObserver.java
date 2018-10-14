package libraries;

/**
 *
 * @author mblan
 */
public class SolObserver extends Observer{
    
    private double valorCanvi = 3.25;
    
    public SolObserver(Subject subject){
        
        this.subject = subject;
        this.subject.agregar(this);
        
    }
    
    @Override
    public void actualitzar(){
        
        System.out.println("PEN: " + (subject.estat * valorCanvi));
        
    }
    
}
