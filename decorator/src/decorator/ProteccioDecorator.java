
package decorator;

public class ProteccioDecorator extends ComptaDecorator{
    
    public ProteccioDecorator(IComptaBancaria comptaDecorada){
        
        super(comptaDecorada);
        
    }
    
    @Override
    public void obrirCompta(Compta c){
        
        this.comptaDecorada.obrirCompta(c);
        proteccio(c);
        
    }
    
    public void proteccio(Compta c){
        
        System.out.println("Protecció afagida a la compta " + c.getId());
        
    }
    
}
