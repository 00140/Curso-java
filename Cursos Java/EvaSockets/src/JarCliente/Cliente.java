package JarCliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Objects;

public class Cliente extends ConexionC{
    VariablesC variablesC;

    public Cliente(VariablesC variablesC) throws IOException {
        super(variablesC);
        this.variablesC = variablesC;
    }

    public void startClient() //Método para iniciar el cliente
    {
        new Thread(() -> {
            try
            {
                //Flujo de datos hacia el servidor
                salidaServidor = new DataOutputStream(cs.getOutputStream());
                //Se obtiene el flujo entrante desde el cliente

                new Timer(0, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (variablesC.getMansajeSalida() != null){
                            if(!Objects.equals(variablesC.getMansajeSalida(), "")) {
                                try {
                                    salidaServidor.writeUTF(variablesC.getMansajeSalida() + "\n");
                                } catch (IOException ex) {
                                    throw new RuntimeException(ex);
                                }
                            }
                        }
                    }
                }).start();
                //cs.close();//Fin de la conexión

            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }).start();
    }
}
