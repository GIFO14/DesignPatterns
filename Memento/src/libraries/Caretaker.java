package libraries;

import java.util.ArrayList;

/**
 *
 * @author mblan
 */
public class Caretaker {

    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {

        mementos.add(m);
        
    }
    
    public Memento getMemento (short index) {
        
        return mementos.get(index);
    }

}
