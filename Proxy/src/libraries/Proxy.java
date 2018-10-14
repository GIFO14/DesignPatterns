package libraries;

/**
 *
 * @author mblan
 */
public class Proxy implements ICompta{

    private ICompta cb;
    
    public Proxy(ICompta compta){
        
        this.cb = compta;
        
    }
    
    @Override
    public Compta retirarDiners(Compta compta, double diners){
    
        if(cb == null){
            
            cb = new ComptaBancaria();
            return cb.retirarDiners(compta, diners);
            
        }else{
            
            return cb.retirarDiners(compta, diners);
            
        }
    
    }
    
    @Override
    public Compta depositarDiners(Compta compta, double diners){
    
        if(cb == null){
            
            cb = new ComptaBancaria();
            return cb.depositarDiners(compta, diners);
            
        }else{
            
            return cb.depositarDiners(compta, diners);
            
        }
    
    }
    
    @Override
    public void mostrarSaldo(Compta compta){
    
        if(cb == null){
            
            cb = new ComptaBancaria();
            cb.mostrarSaldo(compta);
            
        }else{
            
            cb.mostrarSaldo(compta);
            
        }
    
    }
    
}
