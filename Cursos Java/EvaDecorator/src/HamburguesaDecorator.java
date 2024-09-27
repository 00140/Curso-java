public abstract class HamburguesaDecorator implements Hamburguesa {

    private final Hamburguesa hamburguesa;

    public HamburguesaDecorator(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    @Override
    public String getdescripcionhamburguesa() {
        return hamburguesa.getdescripcionhamburguesa();
    }

    @Override
    public int getcostohamburguesa() {
        return hamburguesa.getcostohamburguesa();
    }
}
