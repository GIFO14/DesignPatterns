
package decorator;

public abstract class ComptaDecorator implements IComptaBancaria{

    protected IComptaBancaria comptaDecorada;
    
    public ComptaDecorator(IComptaBancaria comptaDecorada){
        
        this.comptaDecorada = comptaDecorada;
        
    }
    
    @Override
    public void obrirCompta(Compta c){
        
        this.comptaDecorada.obrirCompta(c);
        
    }
    
}
