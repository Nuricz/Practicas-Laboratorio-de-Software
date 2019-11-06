package practica8.ej1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * HoraActual
 */
public class HoraActual implements Runnable {

    public static void main(String[] args) {
        HoraActual hora = new HoraActual();
        Thread t1 = new Thread(hora);
        t1.start();
    }

    Thread t;

    @Override
    public void run() {
        while (true) {
            Date date = new Date(); // given date
            Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
            calendar.setTime(date); // assigns calendar to given date
            while (true) {
                System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));                                                                                        // format
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}