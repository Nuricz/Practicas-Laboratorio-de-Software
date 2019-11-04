package practica6.Ejemplos_Teoria.VirtualPerson;

/**
 * VirtualCafe
 */
public class VirtualCafe {
    public static void serveCustomer(VirtualPerson cust, CoffeeCup cup) {
        try {
            cust.drinkCoffee(cup);
            System.out.println("El Café está OK.");
        } catch (TooColdException e) {
            System.out.println("El Café está muy frío.");
        } catch (TooHotException e) {
            System.out.println("El Café está muy caliente.");
        } // catch (TemperatureException e) {
          // System.out.println("El Café no está OK");
          // }
    }

    public static void serveCustomer2(VirtualPerson cust, CoffeeCup cup) {
        try {
            cust.drinkCoffee(cup);
        } catch (TooColdException e) {
            int temp = e.getTemperature();
            if (temp > 55 && temp <= 65) {
            } else if (temp > 0 && temp <= 55) {
            } else if (temp <= 0) {
                // código JAVA
            }
        } catch (TooHotException e) {
            int temp = e.getTemperature();
            if (temp >= 85 && temp < 100) {
            } else if (temp >= 100 && temp < 2000) {
            } else if (temp >= 2000) {
            }
        }
    }
}
