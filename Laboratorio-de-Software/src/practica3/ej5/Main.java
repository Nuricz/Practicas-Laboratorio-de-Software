package practica3.ej5;

import java.util.Iterator;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("hola");
        s.push("chau");
        Iterator<Object> si = s.iterator();
        while(si.hasNext()){
            System.out.println(si.next());
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

        
    }
}