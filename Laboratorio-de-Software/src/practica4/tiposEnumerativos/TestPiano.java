package practica4.tiposEnumerativos;

/**
 * TestPiano
 */
public class TestPiano {

    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.afinar();
        piano.afinar(FrecuenciasDeLA.HZ440);
        piano.hacerSonar();
        piano.hacerSonar(Notas.DO,4);
        System.out.println(piano.queEs());
    }
}