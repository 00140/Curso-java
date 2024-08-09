package evaluacion290524;

public class HiloContador extends Thread {

    private boolean ejecutar = true;

    public void run() {
        int valor = 1;
        Contador contador = new Contador();

        while (ejecutar) {
            System.out.println(valor);
            contador.esperar(3);
            valor++;
        }
    }
    public void stopContador(){
        ejecutar=false;
    }
}