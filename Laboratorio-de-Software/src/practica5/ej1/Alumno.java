package practica5.ej1;

/**
 * Alumno
 */
public class Alumno {

    private String nombre;
    private String apellido;
    private String legajo;
    private String dni;


    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String legajo, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return this.legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", legajo='" + getLegajo() + "'" +
            ", dni='" + getDni() + "'" +
            "}";
    }
    

}