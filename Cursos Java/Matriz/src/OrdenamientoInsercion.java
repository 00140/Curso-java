public class OrdenamientoInsercion {
    public static void main(String[] args) {
        int [] matriz ={2,4,5,1,3};

        insercion(matriz);

    }
    public static void insercion(int[] matriz){
        for (int i = 1; i < matriz.length; i++) {
            int aux = matriz[i];
            int j = i - 1;
            mostrarMatriz(matriz, aux, matriz[j],"Antes del While");

            while (((j > -1) && (matriz[j]>aux))){
                matriz[j + 1] = matriz[j];
                mostrarMatriz(matriz, aux, matriz[j], "Dentro del While");
                j--;
            }

            matriz[j + 1] = aux;
            mostrarMatriz(matriz, aux, matriz[j + 1], "Despues del While");

        }
    }
    private static void mostrarMatriz(int[] matriz, int aux, int matrizJ, String mensaje){
        for (int elemento: matriz) {
            System.out.print(" "+elemento);
        }
        System.out.print(" Aux: " + aux + " > " + matrizJ + " " + mensaje);
        System.out.println(" ");
    }
}

//El primer elemento ya se considera ordenado, por ello empieaza en i = 1
//La idea de este ordenamiento es colocar todos los mayores a la derecha y
//los menores a la izquierda.
//En el metodo mostrarMatriz se muestra un poco la operacion del mismo
//agarra un valor y lo compara con sus antecesores y asi sucesivamente.
//La variable Aux representa el valor actual evaluado con sus antecesores
//hasta colocarlo en la poscion correcta.

