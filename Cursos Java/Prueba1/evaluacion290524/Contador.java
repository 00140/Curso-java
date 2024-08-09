package evaluacion290524;

public class Contador {
    public void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000L);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
