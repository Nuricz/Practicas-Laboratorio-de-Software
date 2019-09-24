package practica3.ej5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Stack
 */
public class Stack implements Iterable<Object> {
    private final java.util.ArrayList<Object> items = new ArrayList<Object>();
    public Stack() {
        
    }
    public void push(Object item) {
        items.add(item);
    }
    
    public Object pop() {
        return items.isEmpty() ? null : items.remove(0);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void finalize() {
        
    }


    public Iterator<Object> iterator(){
        return new Iterator<Object> (){

            int i = 0;
    
            @Override
            public boolean hasNext() {
                return i < items.size();
            }
    
            @Override
            public Object next() {
                return items.get(i++);
            }
            
        };
    }

}