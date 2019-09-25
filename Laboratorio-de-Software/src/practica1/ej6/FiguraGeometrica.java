package practica1.ej6;

/**
 * FiguraGeometrica
 */
public abstract class FiguraGeometrica {
    private String color;

    public FiguraGeometrica(){}

    public abstract void dibujar();

    public abstract int area();

    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }

}