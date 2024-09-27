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

        listIngredientes = new String[ingredientes.size()+1];



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
        System.out.println(listIngredientes[SelecIngrediente]);


            return new Ingrediente(hamburguesa, listIngredientes[SelecIngrediente], ingredientes.get(listIngredientes[SelecIngrediente]));
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
    public static Hamburguesa Lechuga(Hamburguesa hamburguesa) {
        return new Ingrediente(hamburguesa, "Lechuga", 10);
    }
    public static Hamburguesa Jitomate(Hamburguesa hamburguesa) {

        return new Ingrediente(hamburguesa, "Jitomate", 15);
    }
    public static Hamburguesa Pinia(Hamburguesa hamburguesa) {
        return new Ingrediente(hamburguesa, "Piña", 9);
    }
    public static Hamburguesa Jamon(Hamburguesa hamburguesa) {
        return new Ingrediente(hamburguesa, "Jamón", 8);
    }
    public static Hamburguesa Salami(Hamburguesa hamburguesa) {
        return new Ingrediente(hamburguesa, "Salami", 20);
    }
    public static Hamburguesa Pepinillos(Hamburguesa hamburguesa) {
        return new Ingrediente(hamburguesa, "Pepinillo", 5);
    }
    public static Hamburguesa Carne(Hamburguesa hamburguesa) {
        return new Ingrediente(hamburguesa, "Carne", 50);
    }
    public static Hamburguesa Queso(Hamburguesa hamburguesa) {
        return new Ingrediente(hamburguesa, "Queso", 12);
    }


}
