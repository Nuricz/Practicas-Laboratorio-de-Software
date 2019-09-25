package practica1.ej6;

/**
 * Rectangulo
 */
public class Rectangulo extends FiguraGeometrica{

    int alto;
    int ancho;

    public Rectangulo(){}

    public Rectangulo(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public void dibujar(){
        System.out.println("Se dibuja un rectángulo de alto: "+alto+" ancho: "+ancho+" de color "+this.getColor());
    }

    public int area(){
        return this.alto*this.ancho;
    }
}