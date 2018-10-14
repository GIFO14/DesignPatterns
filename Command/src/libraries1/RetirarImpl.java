package libraries1;

/**
 *
 * @author mblan
 */
public class RetirarImpl implements IOperacio{
    
    private Compta compta;
    private double diners;
    
    public RetirarImpl(Compta compta, double diners){
        
        this.compta = compta;
        this.diners = diners;
        
    }
    
    @Override
    public void executar(){
        
        this.compta.retirar(this.diners);
        
    }
    
}
