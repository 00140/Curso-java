package JarCliente;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ListenerC implements ActionListener {
    private VariablesC variablesC;

    private JLabel etiquetaIp;
    private JLabel etiquetaPuerto;
    private JTextArea etiquetaHexa;
    private JTextArea etiquetaMensaje;

    // Constructor que recibe las tres etiquetas para modificarlas
    public void ListenerEtiquetas(VariablesC variablesC, JLabel etiquetaIp, JLabel etiquetaPuerto, JTextArea etiquetaHexa, JTextArea etiquetaMensaje) {
        this.etiquetaIp = etiquetaIp;
        this.etiquetaPuerto = etiquetaPuerto;
        this.etiquetaHexa = etiquetaHexa;
        this.etiquetaMensaje = etiquetaMensaje;
        this.variablesC = variablesC;
    }

    private JTextField cajaIP;
    private JTextField cajaPuerto;

    public void ListenerCajas(JTextField cajaIP, JTextField cajaPuerto){
        this.cajaIP = cajaIP;
        this.cajaPuerto = cajaPuerto;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener el texto del botón presionado
        String textoBoton = e.getActionCommand();

        // Cambiar el texto de la etiqueta correspondiente según el botón presionado
        switch (textoBoton) {
            case "CONECTAR":
                System.out.println("hola");
                break;
            case "Enviar":

                break;
            case "Gracias":

                break;

        }
    }
    public void agregarTextoMensaje(VariablesC variablesC) {
        new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!Objects.equals(variablesC.getMensajesEntrada(), "")) {
                    etiquetaMensaje.append(variablesC.getMensajesEntrada() + "\n");// Agrega el texto con salto de línea
                    variablesC.setMensajesEntrada("");
                }
            }
        }).start();

    }
}
