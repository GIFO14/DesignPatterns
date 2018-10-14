package Main;

import libraries.DollarObserver;
import libraries.EuroObserver;
import libraries.SolObserver;
import libraries.Subject;

/**
 *
 * @author mblan
 */
public class App {

    public static void main(String[] args) {
        
        Subject subject = new Subject();
        
        new DollarObserver(subject);
        new SolObserver(subject);
        new EuroObserver(subject);
        
        System.out.println("Si desitja canviar 10 Pesos ARG obtendrà: ");
        subject.setEstat(10);
        System.out.println("---------------");
        System.out.println("Si desitja canviar 100 Pesos ARG obtendrà: ");
        subject.setEstat(100);
        
    }
    
}
