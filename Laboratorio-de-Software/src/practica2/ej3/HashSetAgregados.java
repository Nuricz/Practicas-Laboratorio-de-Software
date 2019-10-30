package practica2.ej3;

import java.util.Collection;
import java.util.HashSet;

/**
 * HashSetAgregados
 */
public class HashSetAgregados<E> extends HashSet<E> {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int cantidadAgregados = 0;

    public HashSetAgregados() {
    }

    public HashSetAgregados(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        cantidadAgregados++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        cantidadAgregados += c.size();
        return super.addAll(c);
    }

    public int getCantidadAgregados() {
        return cantidadAgregados;
    }
}