package main;

import libraries.Compta;
import libraries.ComptaBancaria;
import libraries.ICompta;
import libraries.Proxy;

public class main {
            
    public static void main(String[] args) {
        
        Compta c = new Compta("Martí");
        
        ICompta comptaProxy = new Proxy(new ComptaBancaria());
        comptaProxy.mostrarSaldo(c);
        c = comptaProxy.depositarDiners(c, 200);
        c = comptaProxy.retirarDiners(c, 100);
        comptaProxy.mostrarSaldo(c);
        
    }
    
}