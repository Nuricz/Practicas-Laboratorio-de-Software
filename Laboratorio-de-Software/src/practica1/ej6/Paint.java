package practica1.ej6;

/**
 * Paint
 */
public class Paint {

    private FiguraGeometrica[] paleta;

    public Paint(){}

    public void setPaleta(FiguraGeometrica[] paleta){
        this.paleta = paleta;
    }

    public FiguraGeometrica[] getPaleta(){
        return paleta;
    }

    public void init(){
        Circulo c1 = new Circulo();
        c1.setRadio(2);
        c1.setColor("azul");
        Circulo c2 = new Circulo();
        c2.setRadio(3);
        c2.setColor("amarillo");
        Rectangulo r1 = new Rectangulo(2,3);
        r1.setColor("verde");
        Rectangulo r2 = new Rectangulo(4,10);
        r2.setColor("rojo");
        FiguraGeometrica[] fi = {c1,c2,r1,r2};
        this.setPaleta(fi);
        
    }
}