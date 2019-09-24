package practica2.ej1.b;

/**
 * InstrumentoMusical
 */
public interface InstrumentoMusical {
    void hacerSonar();

    String queEs();

    default void afinar() {
    }
}