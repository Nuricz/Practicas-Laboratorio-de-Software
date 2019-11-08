package practica7.javaNetExamples;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.*;

/**
 * ServerMain
 */
public class ServerMain {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/applications/myapp", new MyHandler());

        server.setExecutor(null);

        server.start();
    }
}