import java.util.HashMap;

public class Ingredientes {
    private HashMap<String, Integer> ingredientes;
    String[] listIngredientes;
    public Ingredientes(){
        ingredientes = new HashMap<>();
        ingredientes.put("Lechuga", 10);
        ingredientes.put("Queso", 25);
        ingredientes.put("Carne", 15);
        ingredientes.put("Jitomate", 30);
        ingredientes.put("Carne Arrachera", 100);
        ingredientes.put("Cecina", 75);

        listIngredientes = new String[tamanioIngredientes()];
        System.out.println(tamanioIngredientes());

    }
    public int tamanioIngredientes(){
         return ingredientes.size()+1;
    }
    public String listaIngredietes(){
        StringBuilder contenido = new StringBuilder();
        int posicion = 0;
        for (String i : ingredientes.keySet()){
            posicion++;
            listIngredientes[posicion] = i;
            contenido.append(posicion).append(". ").append(i).append(", Costo: ").append(ingredientes.get(i)).append("\n");
        }
        return contenido.toString();
    }
    public Hamburguesa factoryIngredientes(int SelecIngrediente, Hamburguesa hamburguesa){
        String descripcion = listIngredientes[SelecIngrediente];
        int costo = ingredientes.get(descripcion);
        return new Ingrediente(hamburguesa, descripcion, costo);
    }


    public static class Ingrediente extends  HamburguesaDecorator{

        private String descripcion;
        private int costo;
        public Ingrediente(Hamburguesa hamburguesa, String descripcion, int costo) {
            super(hamburguesa);
            this.descripcion = descripcion;
            this.costo = costo;

        }

        @Override
        public String getdescripcionhamburguesa() {
            return super.getdescripcionhamburguesa() + "\n" +descripcion;
        }

        @Override
        public int getcostohamburguesa() {
            return super.getcostohamburguesa() + costo;
        }
    }
}
