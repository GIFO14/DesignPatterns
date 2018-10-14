package libraries;

import java.util.List;

/**
 *
 * @author mblan
 */
public interface CRUD<T> {
    
    List<T> llistar();
    T llegirPerID(int id);
    void registrar(T t);
    void actualitzar(T t);
    void eliminar(int id);
    
}
