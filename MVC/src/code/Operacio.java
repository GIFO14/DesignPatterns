package code;

import java.util.Scanner;

/**
 *
 * @author mblan
 */
public class Operacio {
    
    public void sumar(int n1, int n2) {
       
        String temp = n1 + " + " + n2;
        n1 += n2;
        
        System.out.println("El resultat de '" + temp + "' és: " + n1);
        
    }
    
    public void restar(int n1, int n2) {

        String temp = n1 + " - " + n2;
        n1 -= n2;
            
        System.out.println("El resultat de '" + temp + "' és: " + n1);
        
    }
    
}
