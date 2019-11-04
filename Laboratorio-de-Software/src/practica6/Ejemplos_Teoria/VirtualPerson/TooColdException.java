package practica6.Ejemplos_Teoria.VirtualPerson;

public class TooColdException extends TemperatureException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public TooColdException(int temperature) {
        super(temperature);
    }
}
