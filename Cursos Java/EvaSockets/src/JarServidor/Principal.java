package JarServidor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;

public class Principal {
    public static void main(String[] args) {
        Variables variables = new Variables();
        variables.setPuerto(12345);
        variables.setIP(obtenerIP());

        Ventana ventana1 = new Ventana(variables);
        Listener listener = new Listener();

//        new Timer(5000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                variables.setMensajeEntrada("hola");
//            }
//        }).start();


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
