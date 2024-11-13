import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

//      ejercicio1(); //Ejercicio1
//        ejercicio2();
        ejercicio5();


    }

//    TODO: EJERCICIO 1 CON METODOS
    public static void ejercicio1(){
//        PROBLEMA
//        Crea un array o una matriz de diez posiciones (tamaño diez) de números con valores pedidos por teclado.
//        Muestra por consola el índice de la matriz y el valor que le corresponde.
//        Crea dos métodos uno para rellenar valores y otro para mostrar.

        int[] matriz10 = new int[10];

        rellenarEjercicio1(matriz10);

        mostraEjercicio1(matriz10);

    }
    public static void rellenarEjercicio1(int[] matriz){
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i <= matriz.length-1; i++){
            System.out.print("Coloca el "+i+" valor: ");
            int valores = lector.nextInt();
            matriz[i] = valores;
        }

    }
    public static void mostraEjercicio1(int[] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Indice["+i+"] = " + matriz[i]);
        }
    }

//   TODO:EJERCICIO 2
    public static void ejercicio2(){
//    Crea un array de números de 100 posiciones, es decir, tamaño 100 que contendrá los números del uno al 100.
//    Obtener la suma de todos los números del array y obtener también la media.

        int[] matriz100 = new int[100];

        int suma = 0;
        double media = 0;

        for (int i = 0; i < matriz100.length; i++) {
            matriz100[i] = i+1;
            suma += matriz100[i];
        }

        media = suma / matriz100.length;

        System.out.println("La suma total del Arras es: " + suma);

        System.out.println("La media es: " + media);

    }

//    TODO: EJERCICIO 3
//    A partir de un array de números de cinco posiciones con los siguientes valores 12345.
//    Guardar los valores de este array en otro array distinto pero con los valores invertidos.
//    Es decir que el segundo array deberá tener los valores 54321.
    public static void ejercicio3(){
        int[] matriz5 = {1,2,3,4,5};
        int[] matriz5Invertido = new int[matriz5.length ];
        int contador = matriz5.length - 1;

        System.out.println("Matriz normal:");
        for (int j : matriz5) {
            System.out.print(j);
            matriz5Invertido[contador] = j;
            contador--;
        }
        System.out.println("\nMatriz invertida:");
        for (int i : matriz5Invertido) {
            System.out.print(i);
        }
    }

//    TODO: EJERCICIO 4
//    Rellenar un array de números de tipo entero (int) utilizando el método fill
//    de la clase Arrays y Muéstralos por consola.
    private static void ejercicio4(){

        int[] matriz = new int[5];

//        Arrays.fill(matriz,5);
        Arrays.fill(matriz,2,4,3);

        for (int i : matriz){
            System.out.println(i);
        }
    }

//    TODO: EJERCICIO 5
//    Crear dos arrays, Los dos tienen que ser de tamaño diez.
//    Rellenar uno con números. Puedes rellenarlo a mano utilizando el método Fill y copiarlo al otro utilizando copy of the arrays.
//    Otro método finalmente mostrar los números copiados en el segundo array.
    private static void ejercicio5(){
        int[] matriz = new int[10];
        int[] matrizCopy = new int[10];

        Arrays.fill(matriz, 4);

        matrizCopy = Arrays.copyOfRange(matriz, 1,6);

        for (int i: matrizCopy) {
            System.out.println(i);
        }
    }

}

