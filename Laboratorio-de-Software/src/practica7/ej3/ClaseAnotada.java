package practica7.ej3;
/**
 * Server
 */
@Servidor(archivo = "infoCliente.txt",direccion = "localhost",puerto = 8000)
public class ClaseAnotada {

    @Invocar
    public void hacerAlgo(){
        System.out.println("Hizo algo");
    }
    
    public void hacerNada(){
        System.out.println("no deberia hacer");
    }

    @Invocar
    public void hacerOtraCosa(){
        System.out.println("Hizo otra cosa");
    }
}