package JarServidor;

import java.net.InetAddress;

public class Principal {
    public static void main(String[] args) {
        Variables variables = new Variables();
        variables.setPuerto(12345);
        variables.setIP(obtenerIP());

        Ventana ventana1 = new Ventana(variables);

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
