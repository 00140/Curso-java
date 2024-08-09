import javax.swing.*;
import java.util.Scanner;

public class contadorEvaluacion {
    public static void main(String[] args) {

        String instruccion;

        HiloContador hiloContador = new HiloContador();
        hiloContador.start();

        HiloJPane hiloJPane = new HiloJPane();

        instruccion = hiloJPane.algo();
        if (instruccion.equals("adios")){
            hiloContador.interrupt();
        }



    }

}
