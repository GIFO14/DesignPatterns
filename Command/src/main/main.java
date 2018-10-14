package main;

import libraries1.Compta;
import libraries1.DepositarImpl;
import libraries1.Invoker;
import libraries1.RetirarImpl;

/**
 *
 * @author mblan
 */
public class main {

    public static void main(String[] args) {
        
        Compta compta = new Compta("Martí");
        
        DepositarImpl operacioDepositar = new DepositarImpl(compta, 100);
        RetirarImpl operacioRetirar = new RetirarImpl(compta, 50);
        
        Invoker inv = new Invoker();
        inv.rebreOperacio(operacioDepositar);
        inv.rebreOperacio(operacioRetirar);
        
        inv.executarOperacio();
        
    }
    
}
