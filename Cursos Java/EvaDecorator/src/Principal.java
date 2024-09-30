import javax.swing.*;
import java.util.HashMap;

public class Principal {
    public static void main(String[] args) {

        Hamburguesa basicHambuerguesa = new PanHamburguesa();

        Ingredientes ingredientes = new Ingredientes();

        int opcionInt;

        do {
            String opcionStr = JOptionPane.showInputDialog(null,"Ingredientes para añadir:\n" +
                    ingredientes.listaIngredietes()+
                    "10. Ejemplo\n" +
                    "0. Terminar");
            opcionInt = Integer.parseInt(opcionStr);


            if (opcionInt == 10){
                for (int i = 0; i < 3; i++) {
                    int numero = (int) (Math.random() * ingredientes.tamanioIngredientes()) + 1;
                    basicHambuerguesa = ingredientes.factoryIngredientes(numero, basicHambuerguesa);
                }
                opcionInt = 0;
            }else if (opcionInt != 0){
                basicHambuerguesa = ingredientes.factoryIngredientes(opcionInt, basicHambuerguesa);
            }

        }while (opcionInt != 0);

        JOptionPane.showMessageDialog(null,"• Hamburguesa\n" +
                basicHambuerguesa.getdescripcionhamburguesa() +
                "\n\n• Costo:\n" +
                basicHambuerguesa.getcostohamburguesa());

    }

}
