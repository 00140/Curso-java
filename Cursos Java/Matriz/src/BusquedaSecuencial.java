public class BusquedaSecuencial {
    public static void main(String[] args) {
        int nomBuscar = 3;
        int[] matriz = {1,2,6,3,4,0,3,7,9,5,3,8};

        busquedaSecuencial(matriz,nomBuscar);

    }
    public static int busquedaSecuencial(int[] matriz, int numeroBuscar){
        String posicion="";
        for (int i = 0; i < matriz.length; i++) {
            posicion = posicion + i + " ";
            if (numeroBuscar == matriz[i]){
                System.out.println("Numero " + numeroBuscar + " encontrado");
                System.out.println("En posicion: " + i);
               //return i;
            }
        }

        System.out.print("\nMatriz:  ");
        for (int elemento : matriz) {
            System.out.print(" "+elemento);
        }

        System.out.print("\nPosicion:");
        System.out.print( posicion);

        return -1;
    }
}
