package practica8.ej3;

import java.util.ArrayList;
import java.util.List;

/**
 * Meta
 */
public class Meta {
    private List<Integer> puestos = new ArrayList<Integer>();

    public synchronized void informarLlegada(int corredorId) {
        if (!puestos.contains(corredorId)) {
            puestos.add(corredorId);
        }
    }

    public synchronized List<Integer> puestos() {
        return puestos;
    }
}