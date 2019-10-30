package practica8.ej3;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/**
 * Main
 */
public class Main {
    public static final int CANT_CORREDORES = 5;
    public static final int CANT_THREADS = 4;
    public static final int MAX_METROS = 100;

    public static void main(String[] args) throws InterruptedException {
        var executor = Executors.newFixedThreadPool(CANT_THREADS);
        var meta = new Meta();

        var tasks = new ArrayList<Callable<Void>>();
        for (int i = 0; i < CANT_CORREDORES; i++) {
//            tasks.add(Executors.callable(
//                new Corredor(i, meta, MAX_METROS, 1)));
            tasks.add(new Corredor(i, meta, MAX_METROS, 1));
        }
        executor.invokeAll(tasks);
        executor.shutdown();

        var puestos = meta.puestos();
        System.out.println("Resultado de la carrera:");
        for (Integer id : puestos) {
            System.out.println(id);
        }
    }
}