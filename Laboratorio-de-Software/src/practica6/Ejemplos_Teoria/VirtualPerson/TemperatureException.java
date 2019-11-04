package practica6.Ejemplos_Teoria.VirtualPerson;

public class TemperatureException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int temperature;

    public TemperatureException(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
