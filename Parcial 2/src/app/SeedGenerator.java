package app;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * SeedGenerator
 */
public class SeedGenerator {

    public static <T> List<T> createRandomInstances(Class<T> elClass, int cant)
            throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
            InvocationTargetException, InstantiationException {
        // Creo lista en la cual irán las instancias con @Generator
        List<T> instancias = new ArrayList<>(cant);
        List<T> objetos = new ArrayList<>(cant);
        for (int i = 0; i <= cant; i++) {
            objetos.add(elClass.newInstance());
        }

        for (T objeto : objetos) {
            Method setSeed = objeto.getClass().getDeclaredMethods()[1];
            if (objeto.getClass().getAnnotations() != null) {
                Generator anotacionGenerador = objeto.getClass().getDeclaredAnnotation(Generator.class);
                if (anotacionGenerador != null) {
                    Field[] atributos = objeto.getClass().getDeclaredFields();
                    for (Field a : atributos) {
                        if (a.isAnnotationPresent(SeedValueAttribute.class)) {
                            setSeed.invoke(objeto, (a.getAnnotation(SeedValueAttribute.class).value()));
                            instancias.add(objeto);
                        }
                    }
                }
            }
        }

        return instancias;

    }
}