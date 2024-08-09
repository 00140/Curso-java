package evaluacion290524;

public class principal {
    public static void main(String[] args) {
        String instruccion;
        String LetraParaSalir = "fin";
        Texto texto = new Texto();
        HiloContador hiloContador = new HiloContador();

        hiloContador.start();

        instruccion = texto.algo(LetraParaSalir);
        if (instruccion.equals(LetraParaSalir)){
            hiloContador.stopContador();
        }
    }

}

