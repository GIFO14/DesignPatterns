package libraries;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mblan
 */
public class PersonaDAOImpl implements PersonaDAO{
    
    public List<Persona> llista;
    
    @Override
    public List<Persona> llistar(){
        
        llista = new ArrayList<>();
        
        Persona per = new Persona();
        per.id = 1;
        per.nom_cognoms = "Martí";
        
        llista.add(per);
        
        per = new Persona();
        per.id = 2;
        per.nom_cognoms = "Blanes";
        
        llista.add(per);
        
        per = new Persona();
        per.id = 3;
        per.nom_cognoms = "González";
        
        llista.add(per);
        
        return llista;
    }
    
    @Override
    public Persona llegirPerID(int id){
        //logica
        
        return null;
    }
    
    @Override 
    public void registrar(Persona persona){

        llista.add(persona);
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
