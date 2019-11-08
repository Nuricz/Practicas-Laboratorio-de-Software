package app;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.concurrent.Executors;

import com.sun.net.httpserver.*;

/**
 * SNP
 */
public class SNP {

    Integer cantThreads = 5;

    public static <T> void comenzar() throws IOException, NoSuchMethodException, SecurityException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        

                
        HttpServer server = HttpServer.create(new InetSocketAddress(8000),0);
        List<RandomGenerator> aleatorios = SeedGenerator.createRandomInstances(RandomGenerator.class, 2);
      
        server.createContext("/numero", new MyHandler(aleatorios));

        server.setExecutor(Executors.newFixedThreadPool(10));
        server.start();
    }
}