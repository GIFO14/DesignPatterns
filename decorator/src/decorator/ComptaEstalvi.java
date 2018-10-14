
package decorator;

public class ComptaEstalvi implements IComptaBancaria {
    
    @Override
    public void obrirCompta(Compta c){
        
        System.out.println("S'ha creat una compta d'estalvis amb la següent informació: \nID: " + c.getId() + "\nContrassenya: " + c.getContrassenya());
        
    }
    
}
