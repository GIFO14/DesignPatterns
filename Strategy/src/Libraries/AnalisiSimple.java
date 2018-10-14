package Libraries;

/**
 *
 * @author mblan
 */
public abstract class AnalisiSimple implements IStrategy{
    
    public void analitzar(){
        
        iniciar();
        saltarZIP();
        finalitzar();
        
    }
    
    abstract void iniciar();
    
    abstract void saltarZIP();
    
    abstract void finalitzar();
    
}
