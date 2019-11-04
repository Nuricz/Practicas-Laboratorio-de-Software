package practica6.Ejemplos_Teoria.VirtualPerson;

public class TooHotException extends TemperatureException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public TooHotException(int temperature) {
        super(temperature);
    }
}
