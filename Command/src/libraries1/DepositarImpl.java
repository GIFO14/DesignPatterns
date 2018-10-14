package libraries1;

/**
 *
 * @author mblan
 */
public class DepositarImpl implements IOperacio{
    
    private Compta compta;
    private double diners;
    
    public DepositarImpl(Compta compta, double diners){
        
        this.compta = compta;
        this.diners = diners;
        
    }
    
    @Override
    public void executar(){
        
        this.compta.depositar(this.diners);
        
    }
    
}
