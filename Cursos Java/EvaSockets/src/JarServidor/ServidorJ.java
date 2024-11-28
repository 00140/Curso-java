package JarServidor;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServidorJ extends Conexion{

private VariablesJ variablesJ;
    public ServidorJ(VariablesJ variablesJ) throws IOException {
        super(variablesJ);

        this.variablesJ = variablesJ;
    }

    public void startServer(){

            new Thread(() -> {

                    try {
                        System.out.println("Esperando..."); //Esperando conexión
                        variablesJ.setMensajeEntrada("Esperando...");

                        cs = ss.accept(); //Accept comienza el socket y espera una conexión desde un cliente

                        System.out.println("Cliente en línea");

                        salidaCliente = new DataOutputStream(cs.getOutputStream());

                        //Se le envía un mensaje al cliente usando su flujo de salida

                        salidaCliente.writeUTF("Petición recibida y aceptada");

                        //Se obtiene el flujo entrante desde el cliente
                        BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));

                        while((mensajeServidor = entrada.readLine()) != null) //Mientras haya mensajes desde el cliente
                        {
                            //Se muestra por pantalla el mensaje recibido
                            variablesJ.setMensajeEntrada(mensajeServidor);
                            System.out.println(mensajeServidor);

                        }

                        //Se obtiene el flujo de salida del cliente para enviarle mensajes

                        System.out.println("Fin de la conexión");

                        ss.close();//Se finaliza la conexión con el cliente
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

            }).start();


    }

}
