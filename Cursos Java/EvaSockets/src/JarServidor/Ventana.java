package JarServidor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Ventana extends JFrame {


    public Ventana(Variables variables){
        this.setSize(500,350); //tamaño de la ventana
//        setResizable(false); //No cambiara de tamaño
        setVisible(true); //Hacer visible la ventana
        setLocationRelativeTo(null); //colocar ventana al centro

        panelComponet(variables);

        setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el programa cuando se cierra la ventana
        setTitle("SERVIDOR"); // titulo

    }
    private void panelComponet(Variables variables){

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray); //cambiar fondo
        panel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        JLabel etiquetaTitulo = new JLabel("SERVIDOR",SwingConstants.CENTER);
        metodoEtiqueta(etiquetaTitulo,Color.cyan, 100, 20);
        metodoConstraints(constraints, 0,0,10,1,1,1);
        panel.add(etiquetaTitulo,constraints);

        constraints = new GridBagConstraints();
        JLabel etiquetaIP = new JLabel("IP");
        metodoEtiqueta(etiquetaIP,Color.white, 100, 20);
        metodoConstraints(constraints, 0,1,2,1,1,1);
        panel.add(etiquetaIP,constraints);

        JLabel etiquetaPuerto = new JLabel("puerto");
        metodoEtiqueta(etiquetaPuerto,Color.white, 100, 20);
        metodoConstraints(constraints, 2,1,1,1,1,1);
        panel.add(etiquetaPuerto,constraints);

        JButton botonIniciar = new JButton("Iniciar");
        metodoConstraints(constraints,3,1,2,1,1,1);
        panel.add(botonIniciar,constraints);

        JTextField etiquetaEscribirMensaje = new JTextField("escribe un mensaje");
        metodoConstraints(constraints, 0,2,3,1,1,1);
        panel.add(etiquetaEscribirMensaje,constraints);

        JButton botonEnviar = new JButton("Enviar");
        metodoConstraints(constraints,3,2,2,1,1,1);
        panel.add(botonEnviar,constraints);

        JTextArea etiquetaMensaje = new JTextArea("mensajehexa");
        etiquetaMensaje.setEditable(false);
        metodoConstraints(constraints, 0,3,2,1,1,1);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(etiquetaMensaje,constraints);

        // Crear un JScrollPane que envuelve el JTextArea
        JScrollPane scrollPaneMensaje = new JScrollPane(etiquetaMensaje);
        scrollPaneMensaje.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Siempre mostrar barra de desplazamiento vertical
        scrollPaneMensaje.setPreferredSize(new Dimension(50, 50));
        panel.add(scrollPaneMensaje,constraints);

        JTextArea etiquetaHexadecimal = new JTextArea("mensaje");
        etiquetaHexadecimal.setEditable(false);
        metodoConstraints(constraints, 2,3,3,1,1,1);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(etiquetaHexadecimal,constraints);

        JScrollPane scrollPaneHexa = new JScrollPane(etiquetaHexadecimal);
        scrollPaneHexa.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Siempre mostrar barra de desplazamiento vertical
        scrollPaneHexa.setPreferredSize(new Dimension(50, 50));
        panel.add(scrollPaneHexa,constraints);

        this.getContentPane().add(panel);

        Listener botonListener = new Listener(variables, etiquetaIP, etiquetaPuerto, etiquetaHexadecimal,etiquetaMensaje);

        // Asociar el ActionListener a todos los botones
        botonIniciar.addActionListener(botonListener);
        botonEnviar.addActionListener(botonListener);


    }

    public void textoIP(){

    }
    private GridBagConstraints metodoConstraints(GridBagConstraints constraints,
                                           int x, int y,
                                           int width, int height,
                                           int weightx , int weighty)
    {
        //posicion
        constraints.gridx = x;
        constraints.gridy = y;
        //Cuantas celdas abarca
        constraints.gridwidth = width;
        constraints.gridheight = height;
        //Hacia donde se estira
        constraints.weightx = weightx;
        constraints.weighty = weighty;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;


        return constraints;
    }
    private void metodoEtiqueta (JLabel etiqueta,Color color, int width, int height){
        etiqueta.setPreferredSize(new Dimension(width, height));
        etiqueta.setOpaque(true); //permitir modificar la etiqueta
        etiqueta.setBackground(color); //cambiar el fondo
        return;
    }
}




