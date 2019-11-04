package practica6.Ejemplos_Teoria.VirtualPerson;

/**
 * VirtualPerson
 */
class VirtualPerson{
    private static final int tooCold = 65;
    private static final int tooHot = 85;

    public void drinkCoffee(CoffeeCup cup) throws TooColdException, TooHotException {

        int temperature = cup.getTemperature();

        if (temperature <= tooCold) {
            throw new TooColdException(temperature);
        } else if (temperature >= tooHot) {
            throw new TooHotException(temperature);
        }
    }
}