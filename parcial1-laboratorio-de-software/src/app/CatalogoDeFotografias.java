package app;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * CatalogoDeFotografias
 */
public class CatalogoDeFotografias extends Catalogo<Fotografia>{

    public List<Fotografia> seleccionar(String tematica, String derechos){
        Collections.sort(lista,Recurso.getComparadorTematica());
        Collections.sort(lista,Recurso.getComparadorDerechos());
        return lista;
    }

    public List<Fotografia> seleccionar(String tematica, String derechos, Comparator<Recurso> comp) {
        Collections.sort(lista,Recurso.getComparadorTematica());
        Collections.sort(lista,Recurso.getComparadorDerechos());
        Collections.sort(lista,comp);
        return lista;
    }

    public List<Fotografia> seleccionar(String tematica, String derechos, String tamaño, String orientacion) {
        Collections.sort(lista,Recurso.getComparadorTematica());
        Collections.sort(lista,Recurso.getComparadorDerechos());
        Collections.sort(lista,Fotografia.getComparadorTamaño());
        Collections.sort(lista,Fotografia.getComparadorOrientacion());
        return lista;
    }
    
}