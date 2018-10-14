package libraries;

import java.util.Random;

/**
 *
 * @author mblan
 */
public class Compta {
    
    private String idCompta;
    private String usuari;
    private double saldo;
    
    Random r = new Random();
    
    public Compta(String usuari){
        
        this.usuari = usuari;
        RandomID();
        RandomSaldo();
        
    }
    
    public void RandomID(){
        
        int r1,i = 0;
        
        while(i<=3){
            
            r1 = r.nextInt(888889) + 111111;
            
            if(i<3){
                
                idCompta += r1 + "-";
                
            }else{
                
                idCompta += r1; 
                
            }
            
            idCompta = idCompta.replace("null", "");
            i++;
        }
 
    }
    
    public void RandomSaldo(){
        
        setSaldo(r.nextInt(500) + 1);
        
    }

    public String getIdCompta() {
        return idCompta;
    }

    public String getUsuari() {
        return usuari;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
