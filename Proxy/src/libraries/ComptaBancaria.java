package libraries;

/**
 *
 * @author mblan
 */
public class ComptaBancaria implements ICompta{
    
    @Override
    public Compta retirarDiners(Compta compta, double diners){
    
        double saldoActual = compta.getSaldo() - diners;
        compta.setSaldo(saldoActual);
        
        System.out.println("S'ha retirat correctament els diners de la compta: " + compta.getIdCompta() + " (" + compta.getUsuari() + ")");
        return compta;
        
    }
    
    @Override
    public Compta depositarDiners(Compta compta, double diners){
    
        double saldoActual = compta.getSaldo() + diners;
        compta.setSaldo(saldoActual);
        
        System.out.println("S'ha depositat correctament els diners a la compta: " + compta.getIdCompta() + " (" + compta.getUsuari() + ")");
        return compta;
    
    }
    
    @Override
    public void mostrarSaldo(Compta compta){
        
        System.out.println("El saldo actual d'aquesta compta és: " + compta.getSaldo());
                
    }
    
}
