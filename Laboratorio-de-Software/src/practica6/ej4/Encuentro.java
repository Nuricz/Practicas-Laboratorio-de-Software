package practica6.ej4;

/**
 * Encuentro
 */
public class Encuentro extends Partido implements Tormenta {
    Encuentro() throws Lluvia, FutbolException {
    }

    Encuentro(String fecha) throws Falta, FutbolException {
    }

    void penal() throws Mano {
    }

    public void evento() throws Lluvia {
    }

    public void diluvio() throws Lluvia {
    }

    void jugada() throws Mano {
    }

    public static void main(String[] args) {
        try {
            Encuentro enc = new Encuentro();
            enc.jugada();
        } catch (Mano e) {
        } catch (Lluvia e) {
        } catch (FutbolException e) {
            try {
                Partido par = new Encuentro();
                par.jugada();
            } catch (EquipoIncompleto e2) {
            } catch (Falta e2) {
            } catch (Lluvia e2) {
            } catch (FutbolException e2) {
            }
        }
    }
}