package JarServidor;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Servidor extends Conexion{

private Variables variables;
    public Servidor(Variables variables) throws IOException {
        super(variables);

        this.variables = variables;
    }

    public void startServer(){

            new Thread(() -> {
                int contador = 1;

                    try {
                        System.out.println("Esperando..."); //Esperando conexión
                        variables.setMensajeEntrada("Esperando...");

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
                            System.out.println(mensajeServidor);
                            variables.setMensajeEntrada(mensajeServidor);
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
