package practica6.ej5;

public class Suma {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 0; i <= args.length; i++)
            suma += Integer.parseInt(args[i]);
        System.out.print("La suma es:" + suma);
    }
}