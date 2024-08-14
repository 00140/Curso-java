public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        int [] matriz = {10,3,5,8,6,1};

        seleccion(matriz);

    }

    private static void seleccion(int[] matriz) {


        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz.length; j++) {

                mostrarMatriz(matriz, matriz[i],matriz[j]);

                if (matriz[i] > matriz[j]){
                    int aux = matriz[i];
                    matriz[i] = matriz[j];
                    matriz[j] = aux;
                }

                mostrarMatriz(matriz, matriz[i],matriz[j]);

            }
        }
    }
    private static void mostrarMatriz(int[] matriz, int i, int j){
        for (int elemento: matriz) {
            System.out.print(" "+elemento);
        }
        System.out.println(" comparacion " + i + " > " + j);
        System.out.println(" ");
    }

}
