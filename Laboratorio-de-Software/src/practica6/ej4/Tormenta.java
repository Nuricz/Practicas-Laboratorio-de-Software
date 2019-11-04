package practica6.ej4;

/**
 * Tormenta
 */
public interface Tormenta {
    void evento() throws Lluvia;

    void diluvio() throws Lluvia;

}