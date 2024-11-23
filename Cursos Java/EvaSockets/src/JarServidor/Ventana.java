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
        panel.setLayout(new GridLayout(8,2));

        GridBagConstraints constraints = new GridBagConstraints();

        JLabel etiquetaTitulo = new JLabel("SERVIDOR");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;

        panel.add(etiquetaTitulo, constraints);

        JTextArea cajaTexto = new JTextArea("Area texto");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        panel.add(cajaTexto, constraints);

        // JButton en la fila 0, columna 2 y que ocupa 1 celda de ancho por
        // una de alto.
        JButton boton1 = new JButton ("Boton 1");
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        panel.add(boton1, constraints);

        // JButton en la fila 1, columna 2 y que ocupa 1x1 celdas.
        JButton boton2 = new JButton ("Boton 2");
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        panel.add(boton2, constraints);

        // JButton en la fila 2, columna 0 y que ocupa 1x1 celdas.
        JButton boton3 = new JButton ("Boton 3");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        panel.add(boton3, constraints);

        // JButton en la fila 2, columna 2 y que ocupa 1x1 celdas.
        JButton boton4 = new JButton ("Boton 4");
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        panel.add(boton4, constraints);

        // JTextField en la fila 2, columna 1 y que ocupa 1x1 celdas.
        JTextField campoTexto = new JTextField ("Campo texto");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        panel.add(campoTexto, constraints);



        this.getContentPane().add(panel);

//
//        JLabel etiqueta = new JLabel("Servidor",SwingConstants.CENTER); //etiqueta texto y centrado
////        etiqueta.setBounds(1,1,500,20); //tamaño y pocision
//        etiqueta.setForeground(Color.cyan);//color del texto
//        //etiqueta.setOpaque(true); //permitir modificar la etiqueta
//        //etiqueta.setBackground(Color.cyan); //cambiar el fondo
//
//        GridBagConstraints cuadricula = new GridBagConstraints();
//
//        cuadricula.gridx = 0;
//        cuadricula.gridy = 0;
//        cuadricula.gridwidth = 2;
//        cuadricula.gridheight = 1;
//        cuadricula.weightx = 1;
//        cuadricula.weighty = 1;
//        cuadricula.fill = GridBagConstraints.HORIZONTAL;
//
//
//        panel.add(etiqueta, cuadricula);//agregar etiqueta al panel
//
//        JLabel campoTexto = new JLabel("Prueba");
//
//////        campoTexto.setBounds(5,30,200,20);
//
//        cuadricula = new GridBagConstraints();
//        cuadricula.gridx = 0;
//        cuadricula.gridy = 1;
//        cuadricula.gridwidth = 1;
//        cuadricula.gridheight= 1;
//        cuadricula.weightx = 1;
//        cuadricula.weighty = 1;
//        cuadricula.fill = GridBagConstraints.HORIZONTAL;
//
//        panel.add(campoTexto, cuadricula);
//
//        // Crear un botón
//        JButton boton = new JButton("Obtener dato");
//        boton.setBounds(5,50,10,10);
//
//        cuadricula = new GridBagConstraints();
//        cuadricula.gridx = 0;
//        cuadricula.gridy = 2;
//        cuadricula.gridheight = 1;
//        cuadricula.gridx = 1;
//        cuadricula.gridwidth = 1;
//        cuadricula.gridwidth = 1;
//
//        panel.add(boton, cuadricula);panel.add(campoTexto, cuadricula);
//
//        // Crear un botón
//        JButton boton = new JButton("Obtener dato");
//        boton.setBounds(5,50,10,10);
//
//        cuadricula = new GridBagConstraints();
//        cuadricula.gridx = 0;
//        cuadricula.gridy = 2;
//        cuadricula.gridheight = 1;
//        cuadricula.gridx = 1;
//        cuadricula.gridwidth = 1;
//        cuadricula.gridwidth = 1;
//
//        panel.add(boton, cuadricula);
//
    }
}




