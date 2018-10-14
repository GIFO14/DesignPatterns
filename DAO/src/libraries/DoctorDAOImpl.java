package libraries;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mblan
 */
public class DoctorDAOImpl implements DoctorDAO{
    
    public List<Doctor> llista;
    
    @Override
    public List<Doctor> llistar(){
        
        llista = new ArrayList<>();
        
        Doctor doc = new Doctor();
        doc.id = 1;
        doc.nom_cognoms = "Dr.Martí";
        
        llista.add(doc);
        
        doc = new Doctor();
        doc.id = 2;
        doc.nom_cognoms = "Dr.Blanes";
        
        llista.add(doc);
        
        doc = new Doctor();
        doc.id = 3;
        doc.nom_cognoms = "Dr.González";
        
        llista.add(doc);
        
        return llista;
    }
    
    @Override
    public Doctor llegirPerID(int id){
        //logica
        
        return null;
    }
    
    @Override 
    public void registrar(Doctor doctor){

        llista.add(doctor);
        System.out.println("S'ha registrat " + doctor.nom_cognoms + " correctament");

    }
    
    @Override
    public void actualitzar(Doctor doctor){
        
        System.out.println("S'ha actualitzat a " + doctor.nom_cognoms + ".");
        
    }
    
    @Override 
    public void eliminar(int id){
        
        System.out.println("S'ha eliminat la id: " + id + ".");
        
    }
    
    @Override
    public void curar(){
        
        System.out.println("S'ha curat.");
        
    }
    
}

