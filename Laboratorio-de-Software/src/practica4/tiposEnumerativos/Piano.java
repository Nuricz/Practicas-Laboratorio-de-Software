package practica4.tiposEnumerativos;

/**
 * Piano
 */
public class Piano implements InstrumentoMusical{

    @Override
    public void hacerSonar() {
        System.out.println("Suena las teclas");
    }

    @Override
    public void hacerSonar(Notas n, int duracion) {
        System.out.println("Toqué la nota "+n+" y tardó "+duracion);
    }

    @Override
    public String queEs() {
        return "Piano";
    }

    @Override
    public void afinar() {
        System.out.println("Afino");
    }

    @Override
    public void afinar(FrecuenciasDeLA f) {
        System.out.println("Afino con "+f);

    }

    
}