package code;

/**
 *
 * @author mblan
 */
public class RestarImpl implements IOperacio{
    
    private int n1, n2;
    private Operacio operacio;
    
    public RestarImpl(Operacio operacio, int n1, int n2){
        
        this.operacio = operacio;
        this.n1 = n1;
        this.n2 = n2;
        
    }
    
    @Override
    public void executar(){
        
        operacio.restar(n1, n2);
        
    }
    
}
