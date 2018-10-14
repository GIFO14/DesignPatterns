package libraries;

import facade.App;

public class HotelAPI {

    private double random;
    private App app = new App();

    public void buscarHotel(String dataEntrada, String dataSortida, String lloc, String gama) {
        
        random = Math.random() * 100;
        
        if (random <= 50) {
            System.out.println("S'ha trobat un hotel amb les següents característiques: \nData d'endtrada i sortida: " + dataEntrada + " - " + dataSortida
                    + "\nA: " + lloc
                    + "\nDe gama: " + gama + "\n");
        } else {

            System.out.println("No s'ha trobat cap vol amb aquestes característiques. Torna-ho a provar amb altres filtres.");
            app.code();

        }

    }

}
