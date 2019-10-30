package practica4.tiposEnumerativos;
/**
 * FrecuenciasDeLA
 */
public enum FrecuenciasDeLA {
    HZ440("Organización Internacional de Estandarización ISO 16"),
    HZ444("Afinación de cámara"),
    HZ446("Renacimiento"), 
    HZ480("Órganos alemanes que tocaba Bach");
    String estandar;
    FrecuenciasDeLA(String estandar){
        this.estandar = estandar;
    }

    
}