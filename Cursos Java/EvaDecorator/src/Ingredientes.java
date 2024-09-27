public class Ingredientes implements Hamburguesa {

    @Override
    public void descripcionhamburguesa() {
        System.out.println("Pan");
    }

    @Override
    public void costohamburguesa() {
        int costo = 10;
    }
}
