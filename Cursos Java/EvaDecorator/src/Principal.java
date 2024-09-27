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

            ingredientes.factoryIngredientes(opcionInt, basicHambuerguesa);

            if (opcionInt == 10){
                for (int i = 0; i < 3; i++) {
                    int numero = (int) (Math.random() * 9) + 1;
                    basicHambuerguesa = FactoryIngredientes(numero, basicHambuerguesa);
                }
                opcionInt = 0;
            }else {
                basicHambuerguesa = FactoryIngredientes(opcionInt, basicHambuerguesa);
            }

        }while (opcionInt != 0);

        JOptionPane.showMessageDialog(null,"• Hamburguesa\n" +
                basicHambuerguesa.getdescripcionhamburguesa() +
                "\n\n• Costo:\n" +
                basicHambuerguesa.getcostohamburguesa());

    }
    public static Hamburguesa FactoryIngredientes(int opcionInt, Hamburguesa hamburguesa){
        switch (opcionInt){
            case 1:
                hamburguesa = Ingredientes.Jitomate(hamburguesa);
                break;
            case 2:
                hamburguesa = Ingredientes.Lechuga(hamburguesa);
                break;
            case 3:
                hamburguesa = Ingredientes.Jamon(hamburguesa);
                break;
            case 4:
                hamburguesa = Ingredientes.Pinia(hamburguesa);
                break;
            case 5:
                hamburguesa = Ingredientes.Salami(hamburguesa);
                break;
            case 6:
                hamburguesa = Ingredientes.Pepinillos(hamburguesa);
                break;
            case 7:
                hamburguesa = Ingredientes.Carne(hamburguesa);
                break;
            case 8:
                hamburguesa = Ingredientes.Queso(hamburguesa);
                break;
            case 10:
                break;
            default:
                break;
        }
        return hamburguesa;
    }
}
