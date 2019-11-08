package practica8.ej2;

/**
 * TestSynchronized
 */
public class TestSynchronized extends Thread{
    String[] frase = {"España", "en", "los", "diarios", "de", "mi", "vejez"};   
    
    public TestSynchronized(String id){
        super(id);
    }

    public void run(){
        synchronized(System.out){
            for(int i  = 0; i < frase.length; i++){
                System.out.print(this.getName()+": "+frase[i]+"\n");
            }
        }
    }

    public static void main(String[] args) {
        TestSynchronized t1 = new TestSynchronized("Thread 1");
        TestSynchronized t2 = new TestSynchronized("Thread 2");
        TestSynchronized t3 = new TestSynchronized("Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}