package Libraries;

/**
 *
 * @author mblan
 */
public class AntivirusSimple extends AnalisiSimple{
    
    @Override
    void iniciar(){
        
        System.out.println("S'ha iniciat l'anàlisi simple...");
        
    }
    
    @Override
    void saltarZIP(){
        
        try{
            
            System.out.println("Analitzant...");
            Thread.sleep(3000);
            System.out.println("No s'ha pogut analitzar els fitxers '.zip'...");
            
        }catch (InterruptedException e){
            
            e.printStackTrace();
            
        }
        
    }
    
    @Override
    void finalitzar(){
        
        System.out.println("S'ha finalitzat l'anilisi simple.");
        
    }
    
}
