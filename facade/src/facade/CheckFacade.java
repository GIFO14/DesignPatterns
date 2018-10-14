
package facade;

import libraries.AvioAPI;
import libraries.HotelAPI;

public class CheckFacade {
    
    private HotelAPI hotel; 
    private AvioAPI vol;
    
    public CheckFacade(){
        
        hotel = new HotelAPI();
        vol = new AvioAPI();
        
    }
    
    public void buscarVol(String dia, String hora, String desviaments, String lloc, String gama){
        
        vol.buscar(dia, hora, desviaments, lloc, gama);
        
    }
    
    public void buscarHotel(String dataEntrada, String dataSortida, String lloc, String gama){
        
        hotel.buscarHotel(dataEntrada, dataSortida, lloc, gama);
        
    }
    
}
