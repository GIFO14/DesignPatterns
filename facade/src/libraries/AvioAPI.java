package libraries;

import facade.App;

public class AvioAPI {

    private double random;
    private App app = new App();

    public void buscar(String dia, String hora, String desviaments, String lloc, String gama) {

        random = Math.random() * 100;

        if (random <= 50) {
            System.out.println("S'ha trobat un hotel amb les següents característiques: \nData dia del vol: " + dia + "(a les " + hora + " hores."
                    + "\nCap a: " + lloc + "."
                    + "Desviaments: " + desviaments
                    + "\nDe gama: " + gama + ".\n");
        }else{
        
            System.out.println("No s'ha trobat cap vol amb aquestes característiques. Torna-ho a provar amb altres filtres.");
            app.code();
            
        }
            
    }

}
