package App;

import libraries.Conexio;
import libraries.PersonaDAO;
import libraries.PersonaDAOImpl;

/**
 *
 * @author mblan
 */
public class App1 {

    public static void main(String[] args) {
        
        Conexio c1 = new Conexio( "Martí", "7777", "localhost");
        
        Conexio c2 = new Conexio( "Blanews", "8888", "bas.udg.edu");
        
        PersonaDAO dao = new PersonaDAOImpl(c1);
        
        dao.llistar();
        
    }
    
}
