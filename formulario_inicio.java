//AUTORES: Mauricio Bravo Y ESteban Gaona
//DESCRIPCION: este es el proyecto final sobre un software de facturacion
//DATE: 29-11-20

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario_inicio extends JFrame {
    JButton boton_inicio;

    public formulario_inicio() {
        JLabel l_Titulo = new JLabel("software final de logica de programacion ");
        l_Titulo.setBounds(190, 50, 100, 100);
        JLabel l_version = new JLabel("version 1.0");
        l_version.setBounds(30, 220, 250, 30);
        boton_inicio = new JButton("empezar");
        boton_inicio.setBounds(150, 150, 170, 40);
        // boton_inicio.addActionListener(new boton_click());

        add(l_Titulo);
        add(l_version);
        add(boton_inicio);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}

class boton_click implements ActionListener {

    public void actionperformed(ActionEvent a) {
        formulario_principal form_formulario_principal = new formulario_principal();

    }

}