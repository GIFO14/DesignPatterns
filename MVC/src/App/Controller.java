package App;

import code.IOperacio;
import code.Invoker;
import code.Operacio;
import factory.Factory;
import other.Obj;

/**
 *
 * @author mblan
 */
public class Controller {

    private int n1, n2;
    private IOperacio io;
    private Operacio o;
    
    public void getNum(int n1, int n2){
        
        this.n1 = n1;
        this.n2 = n2;

    }
    
    public void getInstanciaDeIOperacio(String tipusOperacio){
        
        Factory f = new Factory();
        
        o = new Operacio();
        
        io = f.getInstancia(o, tipusOperacio, n1, n2);
        
    }
    
    public void addToInvoker(){
        
        Obj.invoker.addOperacio(io);
        
    }
    
    public void invokerExecute(){
        
        Obj.invoker.executarOperacions();
        
    }
    
    public void recuperarOperacio(int i){
        
        int m = i - 1;
        Obj.invoker.addOperacio(Obj.invoker.recuperarOperacio(m));
    }
    
    public void borrarBackUpList(){
        
        Obj.invoker.caretaker.clearList();
        
    }

}
