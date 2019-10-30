package app;

import java.util.Comparator;

/**
 * Video
 */
public class Video extends Recurso{

    private String[] duraciones = {"CORTA", "MEDIANA", "LARGA"};
    private String duracion="";

    public static class ComparadorDuracion implements Comparator<Video> {
        public static final ComparadorDuracion INSTANCE = new ComparadorDuracion();

        private ComparadorDuracion(){}

        public int compare(Video a, Video b) {
            return a.getDuracion().compareTo(b.getDuracion());
        }
    }

    static public ComparadorDuracion getComparadorDuracion() {
        return ComparadorDuracion.INSTANCE;
    }

    public Video() {
    }

    public Video(String[] duraciones, String duracion) {
        this.duraciones = duraciones;
        this.duracion = duracion;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public boolean setDuracion(String duracion) {
        for(String d : duraciones){
            if(d.equals(duracion))
                this.duracion = duracion;
        }
        if(this.duracion == ""){
            return false;    
        }else{
            return true;
        }
    }


}