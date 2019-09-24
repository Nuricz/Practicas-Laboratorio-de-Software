package practica3.ej3;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * StringConverterSet
 * 
 */
public class StringConverterSet<T> extends AbstractSet<String>{

    private Set<T> items = new HashSet<T>();

    public class IteratorStringAdapter{
        
    }

    @Override
    public Iterator<String> iterator() {

        Iterator<T> it = items.iterator();

        return new Iterator<String>() {

            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public String next() {
                return it.next().toString();
            }
        };
    }

    @Override
    public int size() {
        return items.size();
    }

    
}