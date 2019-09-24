package practica3.ej2;

import java.util.Scanner;

/**
 * InnerTest
 */
public class InnerTest {

    public static void main(String[] args) {
        InnerStatic.Circulo c = new InnerStatic.Circulo();
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        double radio = in.nextDouble();
        c.setRadio(radio);
        in.close();
        c.getArea();
    }
}