import java.util.ArrayList;
import java.util.List;

public class Departamento implements Subject{
    private List<Observer> observadores = new ArrayList<>();
    private String estado;

    public void setEstado(String estado) {
        this.estado = estado;
        notifyObservers(); // Notificar a los observadores cuando cambia el estado
    }
    public String getEstado() {
        return estado;
    }
    @Override
    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observadores.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observadores) {
            observer.update(estado);
        }
    }
}
