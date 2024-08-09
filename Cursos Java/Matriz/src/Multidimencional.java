public class Multidimencional {
    public static void main(String[] args) {


//        int[][] listaNumeros = new int[3][5];
//
//        listaNumeros[0][0] = 1;
//        listaNumeros[0][1] = 2;
//        listaNumeros[0][2] = 3;
//        listaNumeros[0][3] = 4;
//        listaNumeros[0][4] = 5;
//
//        listaNumeros[1][0] = 1;
//        listaNumeros[1][1] = 2;
//        listaNumeros[1][2] = 3;
//        listaNumeros[1][3] = 4;
//        listaNumeros[1][4] = 5;
//
//        listaNumeros[2][0] = 1;
//        listaNumeros[2][1] = 2;
//        listaNumeros[2][2] = 3;
//        listaNumeros[2][3] = 4;
        
//        listaNumeros[2][4] = 5;

        int [][] listaNumeros = {{1,2,3,4,5},{1,2,3,4,5,9},{1,2,3,4,5}};

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("");
            for (int j = 0; j < listaNumeros[i].length; j++) {
                System.out.print(listaNumeros[i][j] + " ");
            }
        }
    }
}
