import java.awt.event.ActionListener;
import java.util.Timer;

public class HiloContador extends Thread {
    public void run() {
        int contador = 1;


        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(contador);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            contador++;
        }

    }
}
