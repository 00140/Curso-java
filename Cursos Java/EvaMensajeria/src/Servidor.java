import java.io.*;
import java.lang.reflect.Type;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Servidor extends Conexion{
    public Servidor() throws IOException {super("servidor");}
    public void startServer()//Método para iniciar el servidor
    {

        try {
            System.out.println("Servidor iniciado. Esperando clientes...");

            ExecutorService threadPool = Executors.newFixedThreadPool(10);  // Máximo 10 clientes simultáneos

            while (true) {
                cs = ss.accept();  // Espera una conexión de cliente
                System.out.println("Cliente en línea desde: " + cs.getInetAddress().getHostAddress());

                // Crear un nuevo hilo para manejar la conexión del cliente
                threadPool.submit(new ClienteHandler(cs));
            }

        } catch (IOException e) {
            System.out.println("Error en el servidor: " + e.getMessage());
        } finally {
            try {
                if (ss != null) ss.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el servidor: " + e.getMessage());
            }
        }
    }
}

class ClienteHandler implements Runnable {
    private Socket cs;

    public ClienteHandler(Socket cs) {
        this.cs = cs;
    }

    @Override
    public void run() {
        DataOutputStream salidaCliente = null;
        BufferedReader entrada = null;
        String mensajeServidor;

        try {
            // Flujo de salida para enviar mensaje al cliente
            salidaCliente = new DataOutputStream(cs.getOutputStream());

            // Enviar un mensaje de bienvenida al cliente
            salidaCliente.writeUTF("Petición recibida y aceptada");

            // Flujo de entrada para leer mensajes del cliente
            entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));

            int contador = 1;
            String nombre = "";
            String Departamento = "";
            // Leer los mensajes del cliente
            while ((mensajeServidor = entrada.readLine()) != null) {
                System.out.println("Mensaje del cliente: " + mensajeServidor);
                if (contador == 1){nombre = mensajeServidor;contador++;}
                if (contador == 2){Departamento = mensajeServidor; contador++;}
                if (contador == 3){gson(nombre,Departamento,mensajeServidor);}
                System.out.println("Contados = " + contador);
            }
        } catch (IOException e) {
            System.out.println("Error con el cliente: " + e.getMessage());
        } finally {
            try {
                if (entrada != null) entrada.close();
                if (salidaCliente != null) salidaCliente.close();
                if (cs != null) cs.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar los flujos o el socket: " + e.getMessage());
            }
            System.out.println("Conexión con el cliente cerrada.");
        }
    }
    public static void gson(String nombre, String depart, String mgs) {
        List<Empleado> empleados = new ArrayList<>();

        try (Reader reader = new FileReader("datos.json")) {
            Gson gson = new Gson();
            // Definir el tipo de la lista
            Type tipoLista = new TypeToken<List<Empleado>>() {
            }.getType();
            // Leer y convertir el JSON en una lista de personas
            empleados = gson.fromJson(reader, tipoLista);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, creando uno nuevo...");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Agregar un nuevo elemento a la lista
        empleados.add(new Empleado(nombre, depart, mgs));

        // Crear el objeto Gson para guardar los datos de forma bonita
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Convertir la lista de personas a formato JSON
        String json = gson.toJson(empleados);

        // Guardar el JSON actualizado en el archivo
        try (FileWriter writer = new FileWriter("datos.json")) {
            writer.write(json);
            System.out.println("Datos actualizados en datos.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }


