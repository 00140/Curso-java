package JarServidor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class ListenerJ implements ActionListener {

    private VariablesJ variablesJ;

    private JLabel etiquetaIp;
    private JLabel etiquetaPuerto;
    private JTextArea etiquetaHexa;
    private JTextArea etiquetaMensaje;

        // Constructor que recibe las tres etiquetas para modificarlas
    public void ListenerEtiquetas(VariablesJ variablesJ, JLabel etiquetaIp, JLabel etiquetaPuerto, JTextArea etiquetaHexa, JTextArea etiquetaMensaje) {
            this.etiquetaIp = etiquetaIp;
            this.etiquetaPuerto = etiquetaPuerto;
            this.etiquetaHexa = etiquetaHexa;
            this.etiquetaMensaje = etiquetaMensaje;
            this.variablesJ = variablesJ;
        }

        // Método que se ejecuta cuando se hace clic en cualquier botón
        @Override
        public void actionPerformed(ActionEvent e) {
            // Obtener el texto del botón presionado
            String textoBoton = e.getActionCommand();

            // Cambiar el texto de la etiqueta correspondiente según el botón presionado
            switch (textoBoton) {
                case "Iniciar":
                    etiquetaIp.setText(variablesJ.getIP());
                    etiquetaPuerto.setText(""+ variablesJ.getPuerto());
                    variablesJ.setMensajeEntrada("iniciado...");
                    agregarTextoMensaje(variablesJ);

                    ServidorJ serv = null;
                    try {
                        serv = new ServidorJ(variablesJ);
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
    public void agregarTextoMensaje(VariablesJ variablesJ) {
        new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!Objects.equals(variablesJ.getMensajeEntrada(), "")) {
                    etiquetaMensaje.append(variablesJ.getMensajeEntrada() + "\n");// Agrega el texto con salto de línea
                    variablesJ.setMensajeEntrada("");
                }
            }
        }).start();
    }
}
