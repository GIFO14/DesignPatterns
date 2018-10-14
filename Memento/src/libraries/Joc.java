
package libraries;

/**
 *
 * @author mblan
 */
public class Joc {
    
    public String nom_joc;
    public int checkpoint;
    
    @Override
    public String toString(){
        
        return "Partida (Joc: " + nom_joc + ", Checkpoint: " + checkpoint + ")";
    }
    
}
