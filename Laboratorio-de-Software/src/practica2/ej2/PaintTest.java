package practica2.ej2;


/**
 * PaintTest
 */
public class PaintTest {
    public static void main(String[] args) {
        Paint p = new Paint();
        CompararFiguras c = new CompararFiguras();
        p.init();
        FiguraGeometrica[] paleta = p.getPaleta();
        java.util.Arrays.sort(paleta,c);
        for(FiguraGeometrica f : paleta){
            System.out.println("El área de la figura es "+f.area());
            f.dibujar();
            if(f.getClass() == Circulo.class){
                System.out.println("El radio del círculo es "+((Circulo) f).getRadio());
            }
        }
    }
}