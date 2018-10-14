
package main;

import libraries.Caretaker;
import libraries.Joc;
import libraries.Originator;

/**
 *
 * @author mblan
 */
public class app {

    public static void main(String[] args) {
        
        String nomJoc = "Crash Bandicoot";
		
		Joc joc = new Joc();
		joc.nom_joc = nomJoc;
		joc.checkpoint = 1;

		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();

		joc = new Joc();
		joc.nom_joc = nomJoc;
		joc.checkpoint = 2;
		originator.estat = joc;

		joc = new Joc();
		joc.nom_joc = nomJoc;
		joc.checkpoint = 3;
		originator.estat = joc;

		caretaker.addMemento(originator.Guardar()); // ESTADO POSICION 0

		joc = new Joc();
		joc.nom_joc = nomJoc;
		joc.checkpoint = 4;
		originator.estat = joc;
                
		caretaker.addMemento(originator.Guardar()); // ESTADO POSICION 1

		joc = new Joc();
		joc.nom_joc = nomJoc;
		joc.checkpoint = 5;
		originator.estat = joc;
                
		caretaker.addMemento(originator.Guardar()); // ESTADO POSICION 2

		originator.estat = joc;
		originator.Restablir(caretaker.getMemento(1));

		joc = originator.estat;
		System.out.println(joc);
                
    }
    
}
