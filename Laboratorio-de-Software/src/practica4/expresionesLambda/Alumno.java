package practica4.expresionesLambda;

/**
 * Alumno
 */
public class Alumno {
    String legajo;
    String nombre;
    String apellido;
    int edad;
    String materiaAprobada;
    int nota;

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateriaAprobada() {
        return materiaAprobada;
    }

    public void setMateriaAprobada(String materiaAprobada) {
        this.materiaAprobada = materiaAprobada;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString() {
        return "alumno";
    }
}