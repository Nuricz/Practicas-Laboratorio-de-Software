package practica4.tiposEnumerativos;
/**
 * InstrumentoMusical
 */
public interface InstrumentoMusical {
    void hacerSonar();

    void hacerSonar(Notas n, int duracion);

    String queEs();

    void afinar();

    void afinar(FrecuenciasDeLA f);
}