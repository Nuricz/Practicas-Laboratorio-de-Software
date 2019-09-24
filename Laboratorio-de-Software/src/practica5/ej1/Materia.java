package practica5.ej1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Materia
 */
public class Materia {

    private String nombre;
    private List<Alumno> alumnos = new ArrayList<Alumno>();

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public SortByLastname getSortByLastname() {
        return SortByLastname.INSTANCE;
    }

    public SortByName getSortByName() {
        return SortByName.INSTANCE;
    }

    public static class SortByName implements Comparator<Alumno> {
        public static final SortByName INSTANCE = new SortByName();

        private SortByName(){}

        public int compare(Alumno a, Alumno b) {
            return a.getNombre().compareTo(b.getNombre());
        }
    }

    public static class SortByLastname implements Comparator<Alumno> {
        public final static SortByLastname INSTANCE = new SortByLastname();

        private SortByLastname(){}

        public int compare(Alumno a, Alumno b) {
            return a.getApellido().compareTo(b.getApellido());
        }
    }

   
}
