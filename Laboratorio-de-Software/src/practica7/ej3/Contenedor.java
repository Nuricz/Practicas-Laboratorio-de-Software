package practica7.ej3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.sun.net.httpserver.*;

/**
 * Contenedor
 */
public class Contenedor implements HttpHandler {

  private Object anotada;
  private String direccion;
  private int puerto;
  private String nombreArchivo;
  private List<Method> metodos = new ArrayList<Method>();

  public void levantarServidor() throws IOException {
    HttpServer server = HttpServer.create(new InetSocketAddress(this.puerto), 0);
    server.createContext("/recurso", this);
    server.setExecutor(null);
    server.start();
  }

  public Contenedor(Object anotada) {
    this.anotada = anotada;
    Class<?> clase = anotada.getClass();
    if (clase.isAnnotationPresent(Servidor.class)) {
      Servidor anotation = clase.getAnnotation(Servidor.class);
      this.direccion = anotation.direccion();
      this.puerto = anotation.puerto();
      this.nombreArchivo = anotation.archivo();
    }
    for (Method m : clase.getDeclaredMethods()) {
      if (m.isAnnotationPresent(Invocar.class)) {
        this.metodos.add(m);
      }
    }
  }

  @Override
  public void handle(HttpExchange t) throws IOException {
    String ip = t.getRemoteAddress().getAddress().getHostAddress();
    LocalDateTime fechaHora = LocalDateTime.now(); // given date
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    File file = new File(this.nombreArchivo);
    file.createNewFile();
    FileWriter fw = new FileWriter(file);
    fw.write("Fecha y hora: " + fechaHora.format(dtf) + " IP: " + ip);
    fw.close();
    // Mi código
    for (Method m : metodos) {
      try {
        m.invoke(this.anotada);
      } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        e.printStackTrace();
      }
    }
    t.sendResponseHeaders(200, "response".length());
    OutputStream os = t.getResponseBody();
    os.write("response".getBytes());
    os.close();
  }

  public static void main(String[] args) throws IOException {
    Contenedor c = new Contenedor(new ClaseAnotada());
    c.levantarServidor();
  }

}