package practica7.ej1;

/**
 * TestAnotaciones
 */
public class TestAnotaciones {
    public static void main(String[] args) throws Exception{
        new TestAnotaciones().testarYa();
    }

    @SuppressWarnings({"deprecation"})
    public void testarYa(){
        TestDeprecated t2 = new TestDeprecated();
        t2.hacer();
    }
    
}