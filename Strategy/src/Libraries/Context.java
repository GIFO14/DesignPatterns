package Libraries;

/**
 *
 * @author mblan
 */
public class Context {
    
    private IStrategy estrategia;
    
    public Context(IStrategy estrategia){
        
        this.estrategia = estrategia;
        
    }
    
    public void executar(){
        
        this.estrategia.analitzar();
        
    }
    
}
