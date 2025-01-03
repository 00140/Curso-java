public interface Subject {
    void addObserver(Observer observer); // Agregar un observador
    void removeObserver(Observer observer); // Eliminar un observador
    void notifyObservers(); // Notificar a todos los observadores
}
