package practica3.ej1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Stack
 */
public class Stack {

    private static ArrayList<String> items = new ArrayList<>();

    public Stack() {
    }

    public void push(String item) {
        items.add(item);
    }

    public Object pop() {
        return !items.isEmpty() ? items.remove(0) : null;

    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void finalize() {
    }

    public StackIterator getIterator(){
        return StackIterator.INSTANCE;
    }

    static class StackIterator implements Iterator<Object> {
        int cont = 0;

        public static final StackIterator INSTANCE = new StackIterator();

        private StackIterator(){}


        @Override
        public boolean hasNext() {
            return cont < items.size();
        }

        @Override
        public Object next() {
            return items.get(cont++);
        }

    }
}