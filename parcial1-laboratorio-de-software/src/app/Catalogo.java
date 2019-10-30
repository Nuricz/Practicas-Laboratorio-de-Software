package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Catalogo
 */
public class Catalogo<T> implements Iterable<Recurso>{
    List<T> lista = new ArrayList<>();
    

    public void agregar(T e){
        lista.add(e);
    }

    @Override
    public Iterator<Recurso> iterator() {
        return new Iterator<Recurso> (){

            int i = 0;
            @Override
            public boolean hasNext() {
                return i < lista.size();
            }
    
            @Override
            public Recurso next() {
                return (Recurso) lista.get(i++);
            }
            
        };
    }
    


    
}