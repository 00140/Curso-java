public class BusquedaSecuencial {
    public static void main(String[] args) {
        int nomBuscar = 3;
        int[] matriz = {1,2,6,3,4,0,3,7,9,5,3,8};
        String posicion="";


        for (int i = 0; i < matriz.length; i++) {
            posicion = posicion + i + " ";
            if (nomBuscar == matriz[i]){
                System.out.println("Numero " + nomBuscar + " encontrado");
                System.out.println("En posicion: " + i);
            }
        }

        System.out.print("\nMatriz: ");
        for (int elemento : matriz) {
            System.out.print(" " + elemento);
        }

        System.out.println("");
        System.out.println("Posicion:"+posicion);

    }
}
