package App;

import Libraries.AntivirusAvançat;
import Libraries.AntivirusSimple;
import Libraries.Context;

/**
 *
 * @author mblan
 */
public class App {
    
    public static void main(String[] args) {
        
        Context c = new Context(new AntivirusAvançat());
        c.executar();
        
    }
    
}
