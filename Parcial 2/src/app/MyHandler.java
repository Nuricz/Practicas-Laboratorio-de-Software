package app;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.sun.net.httpserver.*;

public class MyHandler implements HttpHandler {

    List<RandomGenerator> aleatorios;

    int position = 0;

    public MyHandler(List<RandomGenerator> aleatorios) {
        this.aleatorios = aleatorios;
    }

    // synchronized
    @Override
    public synchronized void handle(HttpExchange t) throws IOException {
        RandomGenerator e = aleatorios.get(this.position);
         this.position++;
         if(this.position >= aleatorios.size())
            this.position=0;
            System.out.println("pos: "+this.position);  
         System.out.println("Random: "+e.randomGenerator());
        String response = ""+e.randomGenerator();
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

}
