package JarServidor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class Listener implements ActionListener {

    private Variables variables;

    private JLabel etiquetaIp;
    private JLabel etiquetaPuerto;
    private JTextArea etiquetaHexa;
    private JTextArea etiquetaMensaje;

        // Constructor que recibe las tres etiquetas para modificarlas
    public void ListenerEtiquetas(Variables variables,JLabel etiquetaIp, JLabel etiquetaPuerto, JTextArea etiquetaHexa,JTextArea etiquetaMensaje) {
            this.etiquetaIp = etiquetaIp;
            this.etiquetaPuerto = etiquetaPuerto;
            this.etiquetaHexa = etiquetaHexa;
            this.etiquetaMensaje = etiquetaMensaje;
            this.variables = variables;
        }

        // Método que se ejecuta cuando se hace clic en cualquier botón
        @Override
        public void actionPerformed(ActionEvent e) {
            // Obtener el texto del botón presionado
            String textoBoton = e.getActionCommand();

            // Cambiar el texto de la etiqueta correspondiente según el botón presionado
            switch (textoBoton) {
                case "Iniciar":
                    etiquetaIp.setText(variables.getIP());
                    etiquetaPuerto.setText(""+variables.getPuerto());
                    variables.setMensajeEntrada("iniciado...");
                    agregarTextoMensaje(variables);

                    Servidor serv = null;
                    try {
                        serv = new Servidor(variables);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    serv.startServer();
                    break;
                case "Enviar":

                    break;
                case "Gracias":

                    break;

        }
    }
    public void agregarTextoMensaje(Variables variables) {
        new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!Objects.equals(variables.getMensajeEntrada(), "")) {
                    etiquetaMensaje.append(variables.getMensajeEntrada() + "\n");// Agrega el texto con salto de línea
                    variables.setMensajeEntrada("");
                }
            }
        }).start();
    }
}
