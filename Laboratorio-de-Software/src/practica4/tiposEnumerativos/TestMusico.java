package practica4.tiposEnumerativos;

/**
 * TestMusico
 */
public class TestMusico {

    public static void main(String[] args) {
        Musico musico = Musico.INSTANCE;
        musico.setNombre("Alberto Luis Spinetta");
        musico.setInstrumento(new Piano());
    }
}