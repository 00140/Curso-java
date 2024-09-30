import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

    }
    public void ejercicio1(){
        //TODO: PROBLEMA
        //Crea un array o una matriz de diez posiciones (tamaño diez) de números con valores pedidos por teclado.
        //Muestra por consola el índice de la matriz y el valor que le corresponde.
        //Crea dos métodos uno para rellenar valores y otro para mostrar.
        Scanner lector = new Scanner(System.in);

        int[] matriz10 = new int[10];

        for (int i = 0; i <= matriz10.length; i++){
            System.out.println("Coloca el "+i+" valor: ");
            int valores = lector.nextInt();
            matriz10[i] = valores;
        }

        
    }
}

