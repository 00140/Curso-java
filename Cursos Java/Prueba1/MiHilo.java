public class MiHilo extends Thread {

    public void run() {
        int contador = 1;

        do {
            try {
                Thread.sleep(3 * 1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(contador);
            contador++;
        }while (contador>0);
    }
}
