package libraries;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mblan
 */
public class PersonaDAOImpl implements PersonaDAO{
    
    private Conexio conexio;
    
    public PersonaDAOImpl(Conexio c){
        
        conexio = c;
        
    }
    
    @Override
    public List<Persona> llistar(){
        
        System.out.println("Llistant a " + conexio.host + "...");
                
        return null;
    }
    
    @Override
    public Persona llegirPerID(int id){
        //logica
        
        return null;
    }
    
    @Override 
    public void registrar(Persona persona){

        System.out.println("S'ha registrat " + persona.nom_cognoms + " correctament");

    }
    
    @Override
    public void actualitzar(Persona persona){
        
        System.out.println("S'ha actualitzat a " + persona.nom_cognoms + ".");
        
    }
    
    @Override 
    public void eliminar(int id){
        
        System.out.println("S'ha eliminat la id: " + id + ".");
        
    }
    
    @Override
    public void ma(String ma){
        
        System.out.println("La persona és " + ma);
        
    }
    
}
