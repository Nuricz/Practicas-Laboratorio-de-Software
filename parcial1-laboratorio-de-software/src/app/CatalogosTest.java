package app;

import java.util.Iterator;
import java.util.List;

public class CatalogosTest {
    public static void main(String[] args){
        CatalogoDeFotografias catalogo_fotografias = new CatalogoDeFotografias();
        CatalogoDeVideos catalogo_videos = new CatalogoDeVideos();
        Catalogo<Recurso> catalogo = new Catalogo<Recurso>();
        
        Fotografia f1 = new Fotografia();
        f1.setOrientacion("HORIZONTAL");
        f1.setTamaño("CHICO");
        f1.setAutor("Nuria");
        f1.setFecha_subida("07/08/1997");
        String[] t1 = {"PERSONAS","PAISAJES"};
        f1.setTematicas(t1);
        Fotografia f2 = new Fotografia();
        f2.setOrientacion("HORIZONTAL");
        f2.setTamaño("MEDIANO");
        f2.setAutor("Matías");
        f2.setFecha_subida("12/07/2016");
        String[] t2 = {"FAUNA","PAISAJES"};
        f2.setTematicas(t2);
        Fotografia f3 = new Fotografia();
        f3.setOrientacion("VERTICAL");
        f3.setTamaño("GRANDE");
        f3.setAutor("Bárbara");
        f3.setFecha_subida("23/09/2019");
        String[] t3 = {"PAISAJES"};
        f3.setTematicas(t3);
        Fotografia f4 = new Fotografia();
        f4.setOrientacion("HORIZONTAL");
        f4.setTamaño("CHICO");
        f4.setAutor("Agustín");
        f4.setFecha_subida("08/08/2018");
        String[] t4 = {"ARQUITECTURA"};
        f4.setTematicas(t4);
        Fotografia f5 = new Fotografia();
        f5.setOrientacion("VERTICAL");
        f5.setTamaño("GRANDE");
        f5.setAutor("Gonzalo");
        f5.setFecha_subida("31/08/2017");
        String[] t5 = {"FAUNA","PAISAJES", "DE AUTOR"};
        f5.setTematicas(t5);
        catalogo_fotografias.agregar(f1);
        catalogo_fotografias.agregar(f2);
        catalogo_fotografias.agregar(f3);
        catalogo_fotografias.agregar(f4);
        catalogo_fotografias.agregar(f5);

        Video v1 = new Video();
        v1.setAutor("Pablo");
        v1.setDerecho_de_uso("NO COMERCIAL CON MODIFICACIONES PERMITIDAS");
        v1.setDuracion("144");
        v1.setFecha_subida("24/06/2015");
        String[] t6 = {"DE AUTOR"};
        v1.setTematicas(t6);
        Video v2 = new Video();
        v2.setAutor("Pablo");
        v2.setDerecho_de_uso("NO COMERCIAL CON MODIFICACIONES PERMITIDAS");
        v2.setDuracion("144");
        v2.setFecha_subida("24/06/2015");
        String[] t7 = {"DE AUTOR"};
        v2.setTematicas(t7);
        Video v3 = new Video();
        v3.setAutor("Pablo");
        v3.setDerecho_de_uso("NO COMERCIAL CON MODIFICACIONES PERMITIDAS");
        v3.setDuracion("144");
        v3.setFecha_subida("24/06/2015");
        String[] t8 = {"DE AUTOR"};
        v3.setTematicas(t8);
        Video v4 = new Video();
        v4.setAutor("Pablo");
        v4.setDerecho_de_uso("NO COMERCIAL CON MODIFICACIONES PERMITIDAS");
        v4.setDuracion("144");
        v4.setFecha_subida("24/06/2015");
        String[] t9 = {"DE AUTOR"};
        v4.setTematicas(t9);
        Video v5 = new Video();
        v5.setAutor("Pablo");
        v5.setDerecho_de_uso("NO COMERCIAL CON MODIFICACIONES PERMITIDAS");
        v5.setDuracion("144");
        v5.setFecha_subida("24/06/2015");
        String[] t10 = {"DE AUTOR"};
        v5.setTematicas(t10);
        catalogo_videos.agregar(v1);

        catalogo.agregar(f1);
        catalogo.agregar(v1);
        List<Fotografia> lista = catalogo_fotografias.seleccionar("","");
        Iterator<Fotografia> it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}