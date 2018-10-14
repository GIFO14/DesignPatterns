package code;

/**
 *
 * @author mblan
 */
public class SumarImpl implements IOperacio{
    
    private int n1, n2;
    private Operacio operacio;
    
    public SumarImpl(Operacio operacio, int n1, int n2){
        
        this.operacio = operacio;
        this.n1 = n1;
        this.n2 = n2;
        
    }
    
    @Override
    public void executar(){
        
        operacio.sumar(n1, n2);
        
    }
    
}
