package practica3.ej2;
import java.lang.Math;
/**
 * InnerStatic
 */
class InnerStatic {
    static double PI = 3.1416;
    static class Circulo {
        private double radio = 2;
        public double getArea(){
            double a = PI* Math.pow(radio, 2);
            System.out.println("El área es: "+a);
            return a;
        }
        public double getLongitudCircunferencia(){
            double l = 2*PI*radio;
            System.out.println("La longitud es: "+l);
            return l;
        }
        void setRadio(double radio){
            this.radio = radio;
        }
    }
    
}