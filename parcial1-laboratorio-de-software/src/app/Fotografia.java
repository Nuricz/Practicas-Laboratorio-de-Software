package app;

import java.util.Comparator;

/**
 * Fotografia
 */
public class Fotografia extends Recurso{

    private static String[] tamaños = {"CHICO","MEDIANO","GRANDE"};
    private static String[] orientaciones = {"HORIZONTAL", "VERTICAL"};
    private String tamaño="";
    private String orientacion="";

    public static class ComparadorTamaño implements Comparator<Fotografia> {
        public static final ComparadorTamaño INSTANCE = new ComparadorTamaño();

        private ComparadorTamaño(){}

        public int compare(Fotografia a, Fotografia b) {
            return a.getTamaño().compareTo(b.getTamaño());
        }
    }

    static public ComparadorTamaño getComparadorTamaño() {
        return ComparadorTamaño.INSTANCE;
    }

    public static class ComparadorOrientacion implements Comparator<Fotografia> {
        public static final ComparadorOrientacion INSTANCE = new ComparadorOrientacion();

        private ComparadorOrientacion(){}

        public int compare(Fotografia a, Fotografia b) {
            return a.getOrientacion().compareTo(b.getOrientacion());
        }
    }

    static public ComparadorOrientacion getComparadorOrientacion() {
        return ComparadorOrientacion.INSTANCE;
    }

    public Fotografia() {
    }

    public Fotografia(String tamaño, String orientacion) {
        this.tamaño = tamaño;
        this.orientacion = orientacion;
    }

    public String getTamaño() {
        return this.tamaño;
    }

    public boolean setTamaño(String tamaño) {
        for(String t : tamaños){
            if(t.equals(tamaño))
                this.tamaño = tamaño;
        }
        if(this.tamaño == ""){
            return false;    
        }else{
            return true;
        }
    }

    public String getOrientacion() {
        return this.orientacion;
    }

    public boolean setOrientacion(String orientacion) {
        for(String o : orientaciones){
            if(o.equals(tamaño))
                this.orientacion = orientacion;
        }
        if(this.orientacion == ""){
            return false;    
        }else{
            return true;
        }
    }

  
    

}