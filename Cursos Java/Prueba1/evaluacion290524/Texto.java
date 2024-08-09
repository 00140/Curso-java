package evaluacion290524;

import javax.swing.*;

public class Texto {
    public String algo(String letraSalida) {

        String texto = null;

        do {
            texto = JOptionPane.showInputDialog(null, "Por favor escriba algo: ");
            System.out.println(texto);
            if (texto == null){texto = letraSalida;}
        } while (!texto.equals(letraSalida));

        return texto;

    }
}
