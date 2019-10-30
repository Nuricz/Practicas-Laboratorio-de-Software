package app;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * CatalogoDeVideos
 */
public class CatalogoDeVideos extends Catalogo<Video> {

    public List<Video> seleccionar(String tematica, String derechos){
        Collections.sort(lista,Recurso.getComparadorTematica());
        Collections.sort(lista,Recurso.getComparadorDerechos());
        return lista;
    }

    public List<Video> seleccionar(String tematica, String derechos,Comparator<Recurso> comp){
        Collections.sort(lista,Recurso.getComparadorTematica());
        Collections.sort(lista,Recurso.getComparadorDerechos());
        Collections.sort(lista,comp);
        return lista;
    }

    public List<Video> seleccionar(String tematica, String derechos, String duracion) {
        Collections.sort(lista,Recurso.getComparadorTematica());
        Collections.sort(lista,Recurso.getComparadorDerechos());
        Collections.sort(lista,Video.getComparadorDuracion());
        return lista;
    }

    
}