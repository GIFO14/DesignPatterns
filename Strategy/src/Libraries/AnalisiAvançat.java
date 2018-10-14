package Libraries;

/**
 *
 * @author mblan
 */
public abstract class AnalisiAvançat implements IStrategy{
    
    public void analitzar(){
        
        iniciar();
        analitzarMemoria();
        analitzarKeyloggers();
        analitzarRootKits();
        descomprimirZip();
        finalitzar();
        
    }
    
    abstract void iniciar();
    
    abstract void analitzarMemoria();
    
    abstract void analitzarKeyloggers();
    
    abstract void analitzarRootKits();
    
    abstract void descomprimirZip();
    
    abstract void finalitzar();
    
}
