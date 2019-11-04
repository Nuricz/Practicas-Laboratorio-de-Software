package practica6.ej1;

/**
 * Test1
 */
/**
 * Se lanzaba una excepción de tipo Exception2 en vez de Excepcion2, quizás un error de tipeo
 * 
 * Unreachable catch block for Excepcion1. This exception is never thrown from the try statement body
 * Se quitó el catch a la clase Excepcion1 ya que el throw era a la Excepcion2
 */
public class Test1 {
    public static void main(String[] args) throws Excepcion1 {
        try {
            throw new Excepcion2();
        } catch (Excepcion2 e2) {
            System.out.println("Se capturó la Excepción2");
        }
    }
}
