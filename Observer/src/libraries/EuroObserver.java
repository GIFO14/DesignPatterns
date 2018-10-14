/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

/**
 *
 * @author mblan
 */
public class EuroObserver extends Observer{
   
    private double valorCanvi = 3.25;
    
    public EuroObserver(Subject subject){
        
        this.subject = subject;
        this.subject.agregar(this);
        
    }
    
    @Override
    public void actualitzar(){
        
        System.out.println("PEN: " + (subject.estat * valorCanvi));
        
    }
    
}
