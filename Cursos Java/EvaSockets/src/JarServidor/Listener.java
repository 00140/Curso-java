package JarServidor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Listener implements ActionListener {

    private Variables variables;

    private JLabel etiquetaIp;
    private JLabel etiquetaPuerto;
    private JTextArea etiquetaHexa;
    private JTextArea etiquetaMensaje;

    private String textoEtiquetaMensaje = "hola\n";

        // Constructor que recibe las tres etiquetas para modificarlas
    public Listener(Variables variables,JLabel etiquetaIp, JLabel etiquetaPuerto, JTextArea etiquetaHexa,JTextArea etiquetaMensaje) {
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
                    String textoIniciar = "Iniciado...";
                    etiquetaMensaje.setText(textoEtiquetaMensaje + textoIniciar);

//                        Servidor serv = new Servidor();
//                        serv.startServer();
                    break;
                case "Enviar":

                    break;
                case "Gracias":

                    break;

        }
    }
}
