package practica7.ej2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

/**
 * Mapeador
 */
public class Mapeador {

    /**
     * 
     * @param o es un objeto que si tiene asociado la anotación archivo se puede
     *          serializar
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IOException
     */
    private void guardar(Optional<String[]> opti) throws IOException
    {
        if (opti.isPresent()) {
            var pair = opti.get();
            File file = new File(pair[1]);
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write(pair[0]);
            fw.close();
        }

    }

    public Boolean procesar(Object o){
        try{
            this.guardar(this.generar(o));
            System.out.println("Funcó");
            return true;
        }catch(Exception e){
            System.out.println("Falló: "+e.fillInStackTrace());
            return false;
        }
        
    }

    private Optional<String[]> generar(Object o) throws IllegalArgumentException, IllegalAccessException, InstantiationException,
            InvocationTargetException, NoSuchMethodException, SecurityException {
        Class<?> clase = o.getClass();
        if (clase.isAnnotationPresent(Archivo.class)) {
            var sb = new StringBuilder();
            sb.append("<nombreClase>");
            sb.append(clase.getName());
            sb.append("</nombreClase>\n");
            System.out.println(Arrays.deepToString(clase.getDeclaredFields()));
            for (Field f : clase.getDeclaredFields()) {
                if (f.isAnnotationPresent(AlmacenarAtributo.class)) {
                    sb.append("<nombreAtributo>");
                    sb.append(f.getName());
                    sb.append("</nombreAtributo>\n");
                    sb.append("<valorAtributo>");
                    String nombreMetodo = "get"+f.getName().substring(0, 1).toUpperCase()
                                            +f.getName().substring(1);
                    Method m = clase.getDeclaredMethod(nombreMetodo);
                    var value = m.invoke(o);
                    sb.append(value.toString());
                    sb.append("</valorAtributo>\n");
                }
            }
            Archivo anotation = clase.getAnnotation(Archivo.class);
            String fileName = anotation.name().isEmpty()
                ? clase.getName() : anotation.name();
            String[] argumentos = {sb.toString(),fileName};
            return Optional.of(argumentos);
        };
        return Optional.empty();
    }

    public static void main(String[] args) {
        Mapeador mr = new Mapeador();
        Mapeado mo = new Mapeado(); 
        mr.procesar(mo);
    }
}