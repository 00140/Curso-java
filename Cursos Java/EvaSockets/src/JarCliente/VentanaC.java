package JarCliente;


import javax.swing.*;
import java.awt.*;

public class VentanaC extends JFrame{
    public VentanaC(VariablesC variablesC){
        this.setSize(500,350); //tamaño de la ventana
//        setResizable(false); //No cambiara de tamaño
        setLocationRelativeTo(null); //colocar ventana al centro

        panelComponet(variablesC);

        setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el programa cuando se cierra la ventana
        setTitle("CLIENTE"); // titulo
        setVisible(true);  //Hacer visible la ventana

    }
    private void panelComponet(VariablesC variablesC){

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray); //cambiar fondo
        panel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        JLabel etiquetaTitulo = new JLabel("CLIENTE",SwingConstants.CENTER);
        metodoEtiqueta(etiquetaTitulo,Color.cyan, 100, 20);
        metodoConstraints(constraints, 0,0,10,1,1,1);
        panel.add(etiquetaTitulo,constraints);

        constraints = new GridBagConstraints();
        JLabel etiquetaIP = new JLabel("IP",SwingConstants.CENTER);
        metodoEtiqueta(etiquetaIP,Color.white, 100, 20);
        metodoConstraints(constraints, 0,1,2,1,1,1);
        panel.add(etiquetaIP,constraints);

        JTextField cajaIP = new JTextField("IP",SwingConstants.CENTER);
        metodoConstraints(constraints, 2,1,2,1,1,1);
        panel.add(cajaIP,constraints);

        JLabel etiquetaPuerto = new JLabel("puerto",SwingConstants.CENTER);
        metodoEtiqueta(etiquetaPuerto,Color.white, 100, 20);
        metodoConstraints(constraints, 0,2,1,1,1,1);
        panel.add(etiquetaPuerto,constraints);

        JTextField cajaPuerto = new JTextField("puerto",SwingConstants.CENTER);
        metodoConstraints(constraints, 2,2,1,1,1,1);
        panel.add(cajaPuerto,constraints);

        JButton botonIniciar = new JButton("CONECTAR");
        metodoConstraints(constraints,3,1,4,1,1,1);
        panel.add(botonIniciar,constraints);

        JTextField etiquetaEscribirMensaje = new JTextField("escribe un mensaje");
        metodoConstraints(constraints, 0,3,3,1,1,1);
        panel.add(etiquetaEscribirMensaje,constraints);

        JButton botonEnviar = new JButton("Enviar");
        metodoConstraints(constraints,3,3,2,1,1,1);
        panel.add(botonEnviar,constraints);

        JTextArea etiquetaMensaje = new JTextArea();
        etiquetaMensaje.setEditable(false);
        metodoConstraints(constraints, 0,4,2,1,1,1);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(etiquetaMensaje,constraints);

        // Crear un JScrollPane que envuelve el JTextArea
        JScrollPane scrollPaneMensaje = new JScrollPane(etiquetaMensaje);
        scrollPaneMensaje.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Siempre mostrar barra de desplazamiento vertical
        scrollPaneMensaje.setPreferredSize(new Dimension(50, 50));
        panel.add(scrollPaneMensaje,constraints);

        JTextArea etiquetaHexadecimal = new JTextArea();
        etiquetaHexadecimal.setEditable(false);
        metodoConstraints(constraints, 2,4,3,1,1,1);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(etiquetaHexadecimal,constraints);

        JScrollPane scrollPaneHexa = new JScrollPane(etiquetaHexadecimal);
        scrollPaneHexa.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Siempre mostrar barra de desplazamiento vertical
        scrollPaneHexa.setPreferredSize(new Dimension(50, 50));
        panel.add(scrollPaneHexa,constraints);

        this.getContentPane().add(panel);

        ListenerC botonListenerC = new ListenerC();
        botonListenerC.ListenerEtiquetas(variablesC, etiquetaIP, etiquetaPuerto, etiquetaHexadecimal,etiquetaMensaje);

        // Asociar el ActionListener a todos los botones
        botonIniciar.addActionListener(botonListenerC);
        botonEnviar.addActionListener(botonListenerC);


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
