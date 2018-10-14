package factory;

import code.IOperacio;
import code.ImplementacioNoEspecificada;
import code.Operacio;
import code.RestarImpl;
import code.SumarImpl;

/**
 *
 * @author mblan
 */
public class Factory {
   
    public IOperacio getInstancia(Operacio operacio, String tipusOperacio, int n1, int n2){
        
        if (tipusOperacio.equalsIgnoreCase("Sumar")){
            
            return new SumarImpl(operacio, n1, n2);
            
        } else if (tipusOperacio.equalsIgnoreCase("Restar")){
            
            return new RestarImpl(operacio, n1, n2);
            
        } else if(tipusOperacio == null){
            
            return new ImplementacioNoEspecificada();
            
        }
        
        return new ImplementacioNoEspecificada();
    } 
    
}
