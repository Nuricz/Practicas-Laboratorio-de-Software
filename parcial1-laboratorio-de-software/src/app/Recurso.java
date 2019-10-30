package app;

import java.util.Comparator;

/**
 * Archivo
 */
public class Recurso{
    protected String autor;
    protected String fecha_subida;
    protected String[] derechos_de_uso = { "NO COMERCIAL", "NO COMERCIAL CON MODIFICACIONES PERMITIDAS", "COMERCIAL",
            "COMERCIAL CON MODIFICACIONES PERMITIDAS" };
    protected String[] tematicas_p = { "PAISAJES", "PERSONAS", "FAUNA", "FLORA", "DE AUTOR", "ARQUITECTURA" };
    protected String[] tematicas = null;
    protected String derecho_de_uso = "";

    public Recurso() {
    }

    public static class ComparadorFecha implements Comparator<Recurso> {
        public static final ComparadorFecha INSTANCE = new ComparadorFecha();

        private ComparadorFecha(){}

        public int compare(Recurso a, Recurso b) {
            return a.getFecha_subida().compareTo(b.getFecha_subida());
        }
    }

    static public ComparadorFecha getComparadorFecha() {
        return ComparadorFecha.INSTANCE;
    }

    static class ComparadorTematica implements Comparator<Recurso> {
        static final ComparadorTematica INSTANCE = new ComparadorTematica();

        private ComparadorTematica(){}

        @Override
        public int compare(Recurso o1, Recurso o2) {
            int r1, r2 = 0;
            for (String t1 : o1.getTematicas()) {
                for (String t2 : o2.getTematicas()) {
                    r1 = t1.compareTo(t2);
                    if (r1 < r2) {
                        r2 = r1;
                    }
                }
            }
            return r2;
        }
    }

    static class ComparadorDerechos implements Comparator<Recurso> {
        static final ComparadorDerechos INSTANCE = new ComparadorDerechos();

        private ComparadorDerechos(){}
        @Override
        public int compare(Recurso o1, Recurso o2) {
            return o1.getDerecho_de_uso().compareTo(o2.getDerecho_de_uso());
        }
    }


    

    static public ComparadorDerechos getComparadorDerechos() {
        return ComparadorDerechos.INSTANCE;
    }

    static public ComparadorTematica getComparadorTematica() {
        return ComparadorTematica.INSTANCE;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean setDerecho_de_uso(String derecho_de_uso) {
        for (String d : derechos_de_uso) {
            if (d.equals(derecho_de_uso))
                this.derecho_de_uso = derecho_de_uso;
        }
        if (this.derecho_de_uso == "") {
            return false;
        } else {
            return true;
        }

    }

    public String getFecha_subida() {
        return this.fecha_subida;
    }

    public void setFecha_subida(String fecha_subida) {
        this.fecha_subida = fecha_subida;
    }

    public String[] getTematicas() {
        return this.tematicas;
    }

    public String getDerecho_de_uso() {
        return derecho_de_uso;
    }

    public boolean setTematicas(String[] tematicas) {
        for (String d : derechos_de_uso) {
            if (d.equals(derecho_de_uso))
                this.tematicas = tematicas;
        }
        if (this.tematicas == null) {
            return false;
        } else {
            return true;
        }
    }

}