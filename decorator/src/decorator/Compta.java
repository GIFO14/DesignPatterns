
package decorator;

public class Compta {

    private long id;
    private String contrassenya;
    
    public Compta(){
        
    }
    
    public Compta(long id, String contrassenya){
        
        this.id = id;
        this.contrassenya = contrassenya;
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContrassenya() {
        return contrassenya;
    }

    public void setContrassenya(String contrassenya) {
        this.contrassenya = contrassenya;
    }
    
    
    
}
