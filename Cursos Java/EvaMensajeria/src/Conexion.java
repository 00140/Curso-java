import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion {
        protected final int PUERTO = 12345; //Puerto para la conexión
        private final String HOST = "localhost"; //Host para la conexión
        protected String mensajeServidor; //Mensajes entrantes (recibidos) en el servidor
        protected String mensajeCliente;
        protected ServerSocket ss; //Socket del servidor
        protected Socket cs; //Socket del cliente
        protected DataOutputStream salidaServidor, salidaCliente; //Flujo de datos de salida

        public Conexion(String tipo) throws IOException //Constructor
        {
            if(tipo.equalsIgnoreCase("servidor"))
            {
                ss = new ServerSocket(PUERTO);//Se crea el socket para el servidor en puerto 1234
                cs = new Socket(); //Socket para el cliente
            }
            else
            {
                cs = new Socket(HOST, PUERTO); //Socket para el cliente en localhost en puerto 1234
            }
        }
    }

