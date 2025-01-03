import java.io.IOException;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        obtenerIP();
        Servidor servidor = new Servidor();
        servidor.startServer();

        // Crear el sujeto
        Departamento sujeto = new Departamento();

        // Crear observadores
        Observers observador1 = new Observers("Observador 1");
        Observers observador2 = new Observers("Observador 2");

        // Registrar observadores en el sujeto
        sujeto.addObserver(observador1);
        sujeto.addObserver(observador2);

        // Cambiar el estado del sujeto, lo que debería notificar a los observadores
        sujeto.setEstado("Estado 1");

        // Cambiar el estado del sujeto nuevamente
        sujeto.setEstado("Estado 2");

        // Eliminar un observador
        sujeto.removeObserver(observador1);

        // Cambiar el estado una vez más, solo el observador2 será notificado
        sujeto.setEstado("Estado 3");

    }
    public static String obtenerIP(){
        String thisIp = "error de Ip";
        try
        {
            thisIp = InetAddress.getLocalHost().getHostAddress();
            System.out.println("IP:"+thisIp);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return thisIp;
    }
}