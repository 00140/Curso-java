public class OdenamientoBurbuja {
    public static void main(String[] args) {
        int[] matriz = {3,1,9};

        burbuja(matriz);

    }

    public static void burbuja(int[] matriz) {
        int aux = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) {
                System.out.println("* Ciclo i-" + i + " Ciclo j-" + j + " :");

                mostrarMatriz(matriz, aux, "Antes del if");
                System.out.print("  Comparacion: " + matriz[j] + " < " + matriz[j - 1] + " \n");

                if (matriz[j] < matriz[j - 1]) {
                    aux = matriz[j];

                    mostrarMatriz(matriz, aux, "Dentro del if, guardando en Aux");

                    matriz[j] = matriz[j - 1];

                    mostrarMatriz(matriz, aux, "Dentro del if, cambiando");

                    matriz[j - 1] = aux;

                    mostrarMatriz(matriz, aux, "Dentro del if, colocando valor guardado en Aux");
                }
                mostrarMatriz(matriz, aux, "Despues del if");
                System.out.println(" ");
            }
        }
    }

    private static void mostrarMatriz(int[] matriz, int aux, String mensaje) {
        for (int elemento : matriz) {
            System.out.print("  " + elemento);
        }
        System.out.print(" Aux: " + aux + " " + mensaje);
        System.out.println(" ");
    }

}

//Este metodo de ordenamiento va ordenando en pares empieza desde el 1 comparacdo al 0
//y depues 2 y 1 y asi sucesivamente
//lo que lo hace un poco lento ya que en ocaciones en ciclos anteriores ya tenia la solucion
//pero este sigue comparando hastq ue terminen sus ciclos
//En mostrarMatriz colocoque los pint para guiar el entendimiento del mismo.
//Ya que ahi se ve mejor como va ordenando los valores y como es que la pocision 0 de la matriz
//(5) termina al final de la matriz ya que es el mayor

