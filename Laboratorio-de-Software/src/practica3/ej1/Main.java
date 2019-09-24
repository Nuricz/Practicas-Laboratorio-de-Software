package practica3.ej1;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Stack pila = new Stack();
        pila.push("Nuria");
        pila.push("Mati");
        Stack.StackIterator it = pila.getIterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}