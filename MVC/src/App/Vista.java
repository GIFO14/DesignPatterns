package App;

import java.util.Scanner;

/**
 *
 * @author mblan
 */
public class Vista {
    
    public int n1, n2, index;
    public String tipusOperacio;
    public boolean check, check1, check2;
    private Scanner sc = new Scanner(System.in);
    private Scanner scc = new Scanner(System.in);
    
    protected void preguntarNum(){
        
        System.out.print("Introdueix un nombre: ");
        n1 = sc.nextInt();
        
        System.out.print("Introdueix un nombre: ");
        n2 = sc.nextInt();
        
    }
    
    public void preguntarTipusOperacio(){
        
        System.out.println("Si vols sumar escriu 'Sumar', si vols restar escriu 'Restar'.");
        tipusOperacio = scc.nextLine();
        
    }
    
    public void preguntarExecucioOperacions(){
        
        System.out.println("Vols que les operacions entrades es calculin?");
        String str = scc.nextLine();
        
        if (str.equalsIgnoreCase("Si")){
            
            check = true;
            
        } else {
            
            check = false;
            
        }
        
    }
    
    public void preguntarRecuperacioOperacio(){
        
        System.out.println("Desitja recuperar alguna operació que  ja hagi entrat anteriorment?");
        String str = scc.nextLine();
        
        if (str.equalsIgnoreCase("Si")){
            
            check1 = true;
            System.out.println("Si l'operació ha sigut la primera posa '1', si ha sigut la segona posa '2'...");
            index = sc.nextInt();
            
        } else {
            
            check1 = false;
            
        }
        
    }
    
    public void preguntarBorrarBackUpList(){
        
        System.out.println("Desitja esborrar les operacions guardades al back up?");
        String str = scc.nextLine();
        
        if (str.equalsIgnoreCase("Si")){
            
            check2 = true;
            
        } else {
            
            check2 = false;
            
        }
        
    }
    
}
