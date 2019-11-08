package practica7.javaNetExamples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * HttpRedirectExample
 */
public class HttpRedirectExample {

    public static void main(String[] args) {
        try {
            String url = "https://grupo32.proyecto2019.linti.unlp.edu.ar/";
            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setReadTimeout(5000);
            conn.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
            conn.addRequestProperty("User-Agent", "Mozilla");
            conn.addRequestProperty("Referer", "google.com");
            System.out.println("Request URL ... " + url);
            boolean redirect = false;
            // 3xx es redirect
            int status = conn.getResponseCode();
            if (status != HttpURLConnection.HTTP_OK) {
                if (status == HttpURLConnection.HTTP_MOVED_TEMP || status == HttpURLConnection.HTTP_MOVED_PERM
                        || status == HttpURLConnection.HTTP_SEE_OTHER)
                    redirect = true;
            }
            System.out.println("Response Code ... " + status);
            if (redirect) {
                // se quiere redireccionar al header field "location"
                String newUrl = conn.getHeaderField("Location");
                // guardar las cookies y volver a enviarlas ..por las dudas se necesiten
                String cookies = conn.getHeaderField("Set-Cookie");
                // abrir una nueva conexión
                conn = (HttpURLConnection) new URL(newUrl).openConnection();
                conn.setRequestProperty("Cookie", cookies);
                conn.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
                conn.addRequestProperty("User-Agent", "Mozilla");
                conn.addRequestProperty("Referer", "google.com");
                System.out.println("Redirect to URL : " + newUrl);
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer html = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                html.append(inputLine);
            }
            in.close();
            System.out.println("Contenido URL... \n" + html.toString());
            System.out.println("Hecho");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}