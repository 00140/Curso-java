package JarServidor;
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
        this.setSize(500,350); //tamaño de la ventana
//        setResizable(false); //No cambiara de tamaño
        setVisible(true); //Hacer visible la ventana
        setLocationRelativeTo(null); //colocar ventana al centro

        panelComponet();

        setDefaultCloseOperation(EXIT_ON_CLOSE); //se termina el programa cuando se cierra la ventana
        setTitle("SERVIDOR"); // titulo

    }
    private void panelComponet(){

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray); //cambiar fondo
        panel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        JLabel etiquetaTitulo = new JLabel("SERVIDOR",SwingConstants.CENTER);
        metodoConstraints(constraints, 0,0,10,1,1,1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(etiquetaTitulo,constraints);

        constraints = new GridBagConstraints();
        JLabel etiquetaIP = new JLabel("Ip");
        metodoConstraints(constraints, 0,1,3,1,1,0);
        panel.add(etiquetaIP,constraints);

        JLabel etiquetaPuerto = new JLabel("puerto");
        metodoConstraints(constraints, 2,1,3,1,1,1);
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

        JLabel etiquetaHexadecimal = new JLabel("mensajehexa");
        metodoEtiqueta(etiquetaHexadecimal, Color.CYAN);
        metodoConstraints(constraints, 0,3,4,1,1,1);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(etiquetaHexadecimal,constraints);

        JLabel etiquetaMensaje = new JLabel("mensaje");
        metodoEtiqueta(etiquetaMensaje, Color.CYAN);
        metodoConstraints(constraints, 2,3,4,1,1,1);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(etiquetaMensaje,constraints);

        this.getContentPane().add(panel);


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
    private void metodoEtiqueta (JLabel etiqueta,Color color){
        //etiqueta.setPreferredSize(new Dimension(width, height));
        etiqueta.setOpaque(true); //permitir modificar la etiqueta
        etiqueta.setBackground(color); //cambiar el fondo
        return;
    }
}




