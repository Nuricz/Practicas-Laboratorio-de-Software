package practica1.ej6;

/**
 * PaintTest
 */
public class PaintTest {

    public static void main(String[] args) {
        Paint p = new Paint();
        p.init();
        FiguraGeometrica[] paleta = p.getPaleta();
        for(FiguraGeometrica f : paleta){
            System.out.println("El área de la figura es "+f.area());
            f.dibujar();
            if(f.getClass() == Circulo.class){
                System.out.println("El radio del círculo es "+((Circulo) f).getRadio());
            }
        }
    }
}