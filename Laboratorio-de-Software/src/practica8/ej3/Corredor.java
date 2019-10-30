package practica8.ej3;

import java.util.concurrent.Callable;

/**
 * Corredor
 */
public class Corredor implements Callable<Void> {
    private final int id;
    private int metrosCur = 0;
    private final int metrosMax;
    private Meta meta;
    private final int vel;

    Corredor(int id, Meta meta) {
        this(id, meta, 100, 1);
    }

    Corredor(int id, Meta meta, int metrosMax, int vel) {
        this.id = id;
        this.meta = meta;
        this.metrosMax = metrosMax;
        this.vel = vel;
    }

    /**
     * Con la interfaz Runnable no es posible detener el corredor
     * usando excepciones, por eso usamos Callable, y ponemos
     * de ejemplo al jugador 4 que abandona a los 44 metros.
     */
    @Override
    public Void call() throws Exception
    {
        while (metrosCur < metrosMax) {
            this.metrosCur += this.vel;
            System.out.println("Corredor " + id + " avanzó " + metrosCur + "metros");
            if (id == 4 && metrosCur == 44) {
                System.out.println("Corredor " + id + " abandonó");
                throw new Exception();
            }
        }
        meta.informarLlegada(id);

        // Workaround: Callable exige retorno aunque no necesitamos
        return null;
    }
}