
package decorator;

public class ComptaCorrent implements IComptaBancaria{
    
    @Override
    public void obrirCompta(Compta c){
        
        System.out.println("S'ha creat una compta corrent amb la següent informació: \nID: " + c.getId() + "\nContrassenya: " + c.getContrassenya());
        
    }
    
}
