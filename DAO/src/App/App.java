package App;

import libraries.CRUD;
import libraries.Doctor;
import libraries.DoctorDAOImpl;
import libraries.Persona;
import libraries.PersonaDAO;
import libraries.PersonaDAOImpl;

/**
 *
 * @author mblan
 */
public class App {

    public static void main(String[] args) {
        
        CRUD<Persona> daoPer = new PersonaDAOImpl();
        daoPer.llistar().forEach(x -> System.out.println("\nNom: " + x.nom_cognoms + "\nID: " + x.id + "\n"));
        
        Persona per = new Persona();
        per.id = 30;
        per.nom_cognoms = "Maria";
        daoPer.registrar(per);
        
        daoPer.actualitzar(per);
        
        daoPer.eliminar(per.id);
        
        CRUD<Doctor> daoDoc = new DoctorDAOImpl();
        daoDoc.llistar().forEach(x -> System.out.println("\nNom: " + x.nom_cognoms + "\nID: " + x.id + "\n"));
        
        Doctor doc = new Doctor();
        doc.id = 30;
        doc.nom_cognoms = "Maria";
        daoDoc.registrar(doc);
        
        daoDoc.actualitzar(doc);
        
        daoDoc.eliminar(per.id);
        
    }
    
}
