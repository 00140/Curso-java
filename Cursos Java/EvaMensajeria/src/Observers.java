public class Observers implements Observer{
    private String nombre;

    public Observers(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String mensaje) {
        System.out.println(nombre + " nuevo mensaje: " + mensaje);
    }
}
