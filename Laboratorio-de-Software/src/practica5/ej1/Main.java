package practica5.ej1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Main
 */
public class Main {
    
    public static void main(String[] args) {
        Materia logica = new Materia();
        logica.agregarAlumno(new Alumno("Matías Adrián", "Delle Donne", "13655/7", "40188428"));
        logica.agregarAlumno(new Alumno("Nuria Agata", "Czajkowski", "14170/4", "39918712"));
        logica.agregarAlumno(new Alumno("César Agustín", "García", "13412/8", "39493374"));
        logica.agregarAlumno(new Alumno("Agustín", "Vanzato", "14536/8", "40473423"));
        logica.agregarAlumno(new Alumno("Bárbara Elizabeth", "Ferrari", "14352/2", "40546675"));
        logica.agregarAlumno(new Alumno("Gonzalo Nicolás", "Bilbao", "13765/9", "38726652"));
        logica.agregarAlumno(new Alumno("Federico Germán", "Fernández", "13452/5", "39188428"));
        logica.agregarAlumno(new Alumno("Jorge Eduardo", "Vilchez", "13968/7", "39583952"));
        logica.agregarAlumno(new Alumno("Joaquín", "De Antueno", "14998/1", "40188428"));
        logica.agregarAlumno(new Alumno("Lihuel", "Amoroso", "13567/4", "40384750"));
        for(Alumno a : logica.getAlumnos()){
            System.out.println(a.toString());
        } 
        ArrayList<Alumno> listaOrdenada = (ArrayList<Alumno>) logica.getAlumnos();
        Collections.sort(listaOrdenada, logica.getSortByLastname());
        System.out.println("\n \n \n");
        for(Alumno a : listaOrdenada){
            System.out.println(a.toString());
        }
        Collections.sort(listaOrdenada, logica.getSortByName());
        System.out.println("\n \n \n");
        for(Alumno a : listaOrdenada){
            System.out.println(a.toString());
        }
    }
}