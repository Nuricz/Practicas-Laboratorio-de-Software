package practica6.Ejemplos_Teoria;

/**
 * ReDispararOtra
 */
public class ReDispararOtra {
    public static void e() throws Exception {
        System.err.println("Origen de la excepción en e()");
        throw new Exception("disparada en e()");
    }

    public static void f() throws Exception {
        try {
            e();
        } catch (Exception e) {
            System.err.println("Adentro de f(), e.printStackTrace()");
            e.printStackTrace();
            throw new MiException("MiExcepcion()");
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.err.println("Capturada en el main(),  e.printStackTrace()");
            e.printStackTrace();
        }
    }
}