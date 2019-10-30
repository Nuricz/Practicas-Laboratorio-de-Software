package practica4.expresionesLambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Facultad
 */
public class Facultad {

    List<Alumno> alumnos = new ArrayList<>();

/*    public Alumno alumnoConMayorNota(){
    
        FacultadLambda alu = () -> { 
        Alumno ai = alumnos.get(0);
        for(Alumno a : alumnos){
            if (a.getNota() > ai.getNota()){
                ai = a;
            } 
        }
        return ai;
    };
}*/

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
}