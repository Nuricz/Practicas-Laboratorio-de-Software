package practica7.ej1;

/**
 * TestSobreescritura
 */
public class TestSobreescritura {

    @Override
    public String toString() {
        return super.toString()+" Testeando: 'Override'";
        
    }
    public static void main(String[] args) {
        TestSobreescritura test = new TestSobreescritura();
        System.out.println(test.toString());
    }   
}