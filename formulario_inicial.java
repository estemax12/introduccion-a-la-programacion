//AUTHOR:Mauricio Bravo y Esteban Gaona
//DATE:2-12-2020
//DESCRIPTION:proyecto final

import javax.swing.*;
import java.awt.event.*;

public class fomulario_incial extends JFrame implements ActionListener {
    JLabel label_software, label_version;
    JButton boton_comenzar;

    public formulario_inicial(){
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setTitle("formulario_inicial");

        label_software = new JLabel("Software facturacion");
        label_software.setBounds(190, 50, 100, 100);
        add(label_software);
        
        label_version = new JLabel("Version1.0");
        label_version.setBounds(30, 220, 250, 30);
        add(label_version);

        boton_Comenzar = new JButton("comenzar");
        boton_Comenzar.setBounds(150, 150, 170, 40);
        boton_Comenzar.addActionListener(this);
        add(boton_Comenzar);
    }

    public void actionPerformed(ActionEvent a) {
        if (e.getSource() == boton_Comenzar) {
            Menu menu1 = new Menu();
        }
    }

    public static void main(String[] args) throws Exception {
        fomulario_incial fomulario_incial1 = new formulario_inicial();
    }
}