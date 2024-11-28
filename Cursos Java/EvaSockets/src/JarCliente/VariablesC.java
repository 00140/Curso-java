package JarCliente;

public class VariablesC {
    private String MensajesEntrada;
    private String IP;
    private int Puerto;
    private String MansajeSalida;

    public String getMensajesEntrada() {
        return MensajesEntrada;
    }

    public void setMensajesEntrada(String mensajesEntrada) {
        MensajesEntrada = mensajesEntrada;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public int getPuerto() {
        return Puerto;
    }

    public void setPuerto(int puerto) {
        Puerto = puerto;
    }

    public String getMansajeSalida() {
        return MansajeSalida;
    }

    public void setMansajeSalida(String mansajeSalida) {
        MansajeSalida = mansajeSalida;
    }
}
