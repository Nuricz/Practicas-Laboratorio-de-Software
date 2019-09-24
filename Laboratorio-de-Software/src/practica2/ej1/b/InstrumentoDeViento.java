package practica2.ej1.b;

/**
 * InstrumentoDeViento
 */
/**
 * InstrumentoDeViento
 */
abstract class InstrumentoDeViento implements InstrumentoMusical {
    public void hacerSonar(){
        System.out.println("Sonar Vientos");  
    }

    public String queEs() {
        return "Instrumento de Viento";
    }

}