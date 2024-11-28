package JarCliente;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
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
    private JTextField cajaMensaje;

    public void ListenerCajas(VariablesC variablesC, JTextField cajaIP, JTextField cajaPuerto, JTextField cajaMensaje){
        this.cajaIP = cajaIP;
        this.cajaPuerto = cajaPuerto;
        this.cajaMensaje = cajaMensaje;
        this.variablesC = variablesC;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener el texto del botón presionado
        String textoBoton = e.getActionCommand();

        // Cambiar el texto de la etiqueta correspondiente según el botón presionado
        switch (textoBoton) {
            case "CONECTAR":
                try {
                    System.out.println("Boton conectar");
                    variablesC.setIP(cajaIP.getText());
                    int puertoINT = Integer.parseInt(cajaPuerto.getText());
                    variablesC.setPuerto(puertoINT);
                    agregarTextoMensaje(variablesC);
                    try {
                        Cliente cliente = new Cliente(variablesC);
                        cliente.startClient();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null,"Coloque la IP y el Puerto");
                }

                break;
            case "Enviar":
                System.out.println("Enviar");
                variablesC.setMansajeSalida(cajaMensaje.getText());

                break;
            case "Gracias":

                break;

        }
    }
    public void agregarTextoMensaje(VariablesC variablesC) {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(variablesC.getMansajeSalida() != null) {
                    if (!Objects.equals(variablesC.getMansajeSalida(), "")) {
                        System.out.println("desde metodo" + variablesC.getMansajeSalida());
                        etiquetaMensaje.append(variablesC.getMansajeSalida() + "\n");// Agrega el texto con salto de línea
                        variablesC.setMansajeSalida("");
                    }
                }
            }
        }).start();

    }
}
