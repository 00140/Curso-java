package Serie1;
import java.util.Scanner;

public class Principal {

        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            String guardaSemilla = "";
            String semillaStr = "";
            System.out.println("Coloca la semilla: ");
            semillaStr = lector.next();
            int contador = 1;

            for (int x = 0; x < 10; x++) {
                for (int i = 0; i < semillaStr.length(); i++) {
                    char semillaChar = semillaStr.charAt(i);
                    if (i < semillaStr.length() - 1) {
                        char semillaChar2 = semillaStr.charAt(i + 1);
                        if (semillaChar == semillaChar2) {
                            contador++;
                        } else {
                            System.out.print(contador + "" + semillaChar + " ");
                            String contadorguarda = String.valueOf(contador);
                            String semillaguarda = String.valueOf(semillaChar);
                            guardaSemilla = guardaSemilla + contadorguarda + semillaguarda;
                            contador = 1;
                        }
                    } else {
                        System.out.print(contador + "" + semillaChar + " ");
                        String contadorguarda = String.valueOf(contador);
                        String semillaguarda = String.valueOf(semillaChar);
                        guardaSemilla = guardaSemilla + contadorguarda + semillaguarda;
                    }
                }
                System.out.println("");
                contador = 1;
                semillaStr = guardaSemilla;
                guardaSemilla = "";
            }
    }

}
