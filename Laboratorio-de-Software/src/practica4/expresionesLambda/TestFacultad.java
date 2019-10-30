package practica4.expresionesLambda;

/**
 * TestFacultad
 */
public class TestFacultad {

    public static void main(String[] args) {
        Facultad facu = new Facultad();
        Alumno a1,a2;
        a1 = new Alumno();
        a1.setNombre("Nuria");
        a1.setApellido("Czajkowski");
        a1.setEdad(22);
        a1.setLegajo("14170/4");
        a1.setMateriaAprobada("Taller de Programación");
        a1.setNota(9);
        a2 = new Alumno();
        a2.setNombre("Matías");
        a2.setApellido("Delle Donne");
        a2.setEdad(22);
        a2.setLegajo("13655/7");
        a2.setMateriaAprobada("Taller de Programación");
        a2.setNota(10);
        facu.agregarAlumno(a1);
        facu.agregarAlumno(a2);

        FacultadLambda f = () -> {System.out.println(); };
        f.holis();
    }
}