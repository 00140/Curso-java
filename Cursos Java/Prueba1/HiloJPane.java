import javax.swing.*;
import java.util.Objects;

public class HiloJPane {
    public String algo(){

        String texto = null;

        do {
            texto = JOptionPane.showInputDialog(null,"Por favor escriba algo: ");
            System.out.println(texto);
        }while (!texto.equals("adios"));

        return texto;

}
}
