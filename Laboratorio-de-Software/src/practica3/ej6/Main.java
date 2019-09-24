package practica3.ej6;

import java.util.Arrays;
import java.util.Collections;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Czajkowski", "Nuria", 22, "14170/4", 18);
        Estudiante e2 = new Estudiante("Delle Donne", "Matías", 22, "15655/7", 10);
        Estudiante e3 = new Estudiante("García", "César", 23, "13412/8", 6);
        Estudiante[] ee = {e1,e2,e3};

        Arrays.sort(ee,Collections.reverseOrder());

        System.out.println(Arrays.toString(ee));
    }
}