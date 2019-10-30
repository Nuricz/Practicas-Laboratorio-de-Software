package practica4.tiposEnumerativos;

/**
 * AlbertoLuisSpinetta
 */
public enum Musico {
    INSTANCE;

    InstrumentoMusical instrumento;
    String nombre;

    public InstrumentoMusical getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(InstrumentoMusical instrumento) {
        this.instrumento = instrumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}