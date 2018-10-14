package prototype;

public class App {
    
    public static void main(String[] args) {
        
        ComptaEstalvi comptaEstalvi = new ComptaEstalvi();
        comptaEstalvi.setQuantitat(300.5);
        
        ComptaEstalvi comptaClonada = (ComptaEstalvi) comptaEstalvi.clonar();
        
        comptaClonada.mostrar();
        
    }
    
}