package practica2.ej3.b;
import java.util.*;

/**
 * HashSetAgregados
 */
public class HashSetAgregados<T> extends HashSet<T>{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int deleted = 0;

    @Override
    public boolean remove(Object o){
        boolean d = super.remove(o);
        if(d){
            deleted ++;
        }
        return d;

    }
    
}