package Libraries;

/**
 *
 * @author mblan
 */
public class AntivirusAvançat extends AnalisiAvançat{
   
    @Override
    void iniciar(){
        
        System.out.println("S'ha iniciat l'anàlisi avançat...");
        
    }
    
    @Override
    void analitzarMemoria(){
        
        try {
            
            System.out.println("Analitzant memoria...");
            Thread.sleep(3000);
            
        } catch (InterruptedException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    @Override
    void analitzarKeyloggers(){
        
        try {
            
            System.out.println("Analitzant en busca de Keyloggers...");
            Thread.sleep(3000);
            
        } catch (InterruptedException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    @Override
    void analitzarRootKits(){
        
        try {
            
            System.out.println("Analitzant Root Kits...");
            Thread.sleep(3000);
            
        } catch (InterruptedException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    @Override
    void descomprimirZip(){
        
        try {
            
            System.out.println("Descomprimint fitxers '.zip'...");
            Thread.sleep(3000);
            
        } catch (InterruptedException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    @Override
    void finalitzar(){
        
        System.out.println("S'ha finalitzat l'anilisi avançat.");
        
    }
    
}
