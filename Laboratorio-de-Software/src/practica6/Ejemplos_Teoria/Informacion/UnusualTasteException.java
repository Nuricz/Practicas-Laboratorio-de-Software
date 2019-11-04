package practica6.Ejemplos_Teoria.Informacion;

/**
 * UnusualTasteException
 */
class UnusualTasteException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    UnusualTasteException() {
    }

    UnusualTasteException(String msg) {
        super(msg);
    }
}
/*

Un programa que dispara una excepción de tipo UnusualTasteException puede hacerlo
de las dos formas siguiente:
a) throw new UnusualTasteException()
b) throw new UnusualTasteException(“El Café parece Té”) 

try {
 //código JAVA que dispara excepciones
 } catch (UnusualTasteException e) {
 String s = e.getMessage();
 System.out.println(s);
 }
}

*/ 