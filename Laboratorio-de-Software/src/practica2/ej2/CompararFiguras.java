package practica2.ej2;

import java.util.Comparator;




/**
 * CompararFiguras
 */

public class CompararFiguras implements Comparator<FiguraGeometrica> {

    @Override
    public int compare(FiguraGeometrica o1, FiguraGeometrica o2) {
        return o1.area() - o2.area();
    }
}
