public abstract class HamburguesaDecorator extends Ingredientes {
    private final Ingredientes ingredientes;
    public HamburguesaDecorator(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

}
