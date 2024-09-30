public class BusquedaBinaria {
    public static void main(String[] args) {
        int nomBuscar = 3;
        int[] matriz = {1,2,3,4,5,6,7,8,9,10};

        int resultado = busquedaBinaria(matriz, nomBuscar);

        if (resultado != -1){
            System.out.println("numero encontrado en: " + resultado);
        }else {
            System.out.println("No se encontro el numero");
        }

    }
    public static int busquedaBinaria(int[] matriz, int numeroBuscar){
        int inicio = 0;
        int fin = matriz.length - 1;

        while (inicio <= fin){

            int medio = (inicio + fin) / 2;

            if(matriz[medio] == numeroBuscar){
                return medio;
            } else if (matriz[medio] < numeroBuscar) {
                inicio = medio + 1;
            }else {
                fin = medio - 1;
            }
        }
    return -1;
    }
}
