package practica1.ej6;

/**
 * Circulo
 */
public class Circulo extends FiguraGeometrica{

    private int radio;

    public Circulo(){}

    public void dibujar(){
        System.out.println("Se dibuja un círculo de radio: "+radio+" de color "+this.getColor());
    }

    public int area(){
        return (int) (Math.PI * radio * radio);
    }

    public void setRadio(int radio){
        this.radio = radio;
    }

    public int getRadio(){
        return radio;
    }
}