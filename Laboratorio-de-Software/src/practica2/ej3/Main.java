package practica2.ej3;

import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        HashSetAgregados<String> hash = new HashSetAgregados<>();
        List<String> list = new ArrayList<>();
        list.add("Yo");
        list.add("amo");
        list.add("a");
        list.add("Mati");
        // hash.add("Mati");
        // hash.add("chupa");
        // hash.add("limón");
        hash.addAll(list);
        System.out.println(list.size());
    }
}