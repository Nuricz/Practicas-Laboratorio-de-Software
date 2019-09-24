package practica2.ej1.b;

/**
 * InstrumentoDeCuerda
 */
public class InstrumentoDeCuerda implements InstrumentoMusical{

    @Override
    public void hacerSonar() {
        System.out.println("Sonar Cuerdas");
    }

    @Override
    public String queEs() {
        return "Instrumento de Cuerda";
    }

    
}