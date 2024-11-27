package JarServidor;

import java.net.InetAddress;

public class PrincipalJ {
    public static void main(String[] args) {
        VariablesJ variablesJ = new VariablesJ();
        variablesJ.setPuerto(12345);
        variablesJ.setIP(obtenerIP());

        VentanaJ ventanaJ1 = new VentanaJ(variablesJ);
        ListenerJ listenerJ = new ListenerJ();

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
