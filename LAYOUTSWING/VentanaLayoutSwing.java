package org.example.ContinuacionLayoutSwing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JButton boton1;
    private JLabel etiqueta1;
    private JPanel panel2;
    private JLabel etiqueta2;
    private JPanel panel3;
    private JComboBox<String> comboBox3;
    private JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        // panel 1
        panel1 = new JPanel();
        panel1.setBackground(Color.CYAN);
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        boton1 = new JButton("Presioname");
        panel1.add(boton1);
        etiqueta1 = new JLabel("<3");
        panel1.add(etiqueta1);
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta1.setText("Presionaste el boton del panel 1 <3");
            }
        });
        this.getContentPane().add(panel1, 0);


        // panel 2
        String urlimagen = "https://styles.redditmedia.com/t5_5i9q84/styles/communityIcon_bpaioohoook91.png";
        panel2 = new JPanel();
        panel2.setBackground(Color.MAGENTA);
        panel2.setLayout(new FlowLayout());
        //cargamos la imagen de internet
        try {
            URL url = new URL(urlimagen);
            Image imagen = ImageIO.read(url);
            ImageIcon imageIcon = new ImageIcon(imagen);
            etiqueta2 = new JLabel(imageIcon);
            panel2.add(etiqueta2);
            this.getContentPane().add(panel2, 1);
        } catch (MalformedURLException me){
            System.out.println("URL no valida");
        } catch (Exception e){
            System.out.println("error al cargar la imagen");
        }


        // panel 3
        panel3 = new JPanel();
        panel3.setBackground(Color.PINK);
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"Opcion 1","Opcion 2","Opcion 3","Opcion 4"};
        comboBox3 = new JComboBox<>(elementos);
        comboBox3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBox3.getSelectedIndex());
            }
        });
        panel3.add(comboBox3);
        this.getContentPane().add(panel3, 2);


        // panel 4
        panel4 = new JPanel();
        panel4.setBackground(Color.GREEN);
        this.getContentPane().add(panel4, 3);


        this.setVisible(true);

    }
}
