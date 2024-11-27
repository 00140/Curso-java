package JarServidor;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion {
    protected int PUERTO; //Puerto para la conexión
    private String HOST; //Host para la conexión
    protected String mensajeServidor; //Mensajes entrantes (recibidos) en el servidor
    protected String mensajeCliente;
    protected ServerSocket ss; //Socket del servidor
    protected Socket cs; //Socket del cliente
    protected DataOutputStream salidaServidor, salidaCliente;//Flujo de datos de salida



    public Conexion(VariablesJ variablesJ) throws IOException //Constructor
    {
        PUERTO = variablesJ.getPuerto();
        ss = new ServerSocket(PUERTO);//Se crea el socket para el servidor en puerto 1234
        cs = new Socket(); //Socket para el cliente
    }
}
