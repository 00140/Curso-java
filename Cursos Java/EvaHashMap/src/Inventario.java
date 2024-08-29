import javax.swing.*;
import java.util.HashMap;
import java.util.Set;

public class Inventario {
    private HashMap<String, Integer> inventario;

    public Inventario(){
        inventario = new HashMap<>();

        inventario.put("Laptop", 10);
        inventario.put("Smartphone", 25);
        inventario.put("Tablet", 15);
        inventario.put("Audifonos", 30);


    }
    public void crearMenu(){
        String opcion = "5";

        do {
            opcion = JOptionPane.showInputDialog(null, "Sistema de Inventario \n" +
                    "1. Ver Inventario\n" +
                    "2. Agregar Producto\n" +
                    "3. Actualizar stock de producto\n" +
                    "4. Eliminar producto\n" +
                    "5. Salir\n" +
                    "Selecciona una opcion: ");

            switch (opcion){
                case "1":
                    JOptionPane.showMessageDialog(null, verHashMAp(inventario));
                    break;
                case "2":
                    agregarHasMap(inventario);
                        break;
                case "3":
                    actulizarHasMap(inventario);
                        break;
                case "4":
                    eliminarHashMap(inventario);
                        break;
                case "5":
                    break;
                case null:
                    opcion = "5";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }while (!opcion.equals("5"));
    }
    private String verHashMAp(HashMap<String,Integer> hashMap){
        StringBuilder contenido = new StringBuilder();
        for (String i: hashMap.keySet()) {
            contenido.append(i).append(", Stock: ").append(hashMap.get(i)).append("\n");
        }
        System.out.println("Listado de productos");
        return contenido.toString();
    }

    private void agregarHasMap(HashMap<String,Integer> hashMap){
        try {
            String key = JOptionPane.showInputDialog(null,"\nColoque la llave a agregar: ");
            String valoresStr = JOptionPane.showInputDialog(null, "Coloque los valores de la llave colocada: ");
            int valores = Integer.parseInt(valoresStr);
            hashMap.put(key,valores);
            System.out.println("Producto agregado: "+key+", valores: "+valores);
        }catch (Exception e){}

    }
    private void actulizarHasMap(HashMap<String,Integer> hashMap){
        try {
            Set<String> keysSet = hashMap.keySet();
            Object[] keysArray = keysSet.toArray();
            String keyAct = (String) JOptionPane.showInputDialog(null,verHashMAp(hashMap)+"\n¿Que stock de producto quiere actualizar?",
                    "Actualizar", JOptionPane.QUESTION_MESSAGE,null,keysArray,keysArray[0]);
            int stockOld = hashMap.get(keyAct);
            String stockStr = JOptionPane.showInputDialog(null,"Actual stock: "+stockOld+"\nColoque el nuevo stock: ");
            int stock = Integer.parseInt(stockStr);
            hashMap.replace(keyAct, stockOld, stock);
            System.out.println("Producto actualizado: "+keyAct + " Stock Old: " + stockOld + " Stock new: " + stock);
        }catch (Exception e){}
    }
    private void eliminarHashMap(HashMap<String,Integer> hashMap){
        try {
            Set<String> keysSet = hashMap.keySet();
            Object[] keysArray = keysSet.toArray();
            String keyEli = (String) JOptionPane.showInputDialog(null,verHashMAp(hashMap)+"\n¿Que producto quiere ELIMINAR?",
                    "Eliminar", JOptionPane.WARNING_MESSAGE,null,keysArray,keysArray[0]);
            int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar el producto "+keyEli,
                    "Confirmar",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
            if (confirmacion == 0) {
                hashMap.remove(keyEli);
                System.out.println("Producto eliminado: "+keyEli);
            }
        }catch (Exception e){}

    }
}
