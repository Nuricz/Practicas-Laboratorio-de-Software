package practica7.ej3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * Servidor
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Servidor {
    String direccion();
    int puerto();
    String archivo();
}