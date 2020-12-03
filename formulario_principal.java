//AUTHOR:Mauricio Bravo y Esteban Gaona
//DATE:2-12-2020
//DESCRIPTION:proyecto final

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class formulario_principal extends JFrame implements ActionListener {
    JLabel labelMn, label1;
    JButton boton_Clientes;
    JButton boton_facturas;
    JButton boton_AD;

    public Menu(){
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("formulario_principal");

        labelMn = new JLabel("Menu Principal");
        labelMn.setBounds(190, 10, 100, 100);
        add(labelMn);
        label1 = new JLabel("Creado por: Mauricio Bravo y Esteban Gaona");
        label1.setBounds(130, 220, 300, 30);
        add(label1);
        boton_Clientes= new JButton("Clientes");
        boton_Clientes.setBounds(160, 100, 150, 30);
        boton_Clientes.addActionListener(this);
        add(boton_Clientes);
        boton_facturas = new JButton("Facturas ");
        boton_facturas.setBounds(160, 140, 150, 30);
        boton_facturas.addActionListener(this);
        add(boton_facturas);

        boton_AD = new JButton("Acerca De");
        boton_AD.setBounds(160, 180, 150, 30);
        boton_AD.addActionListener(this);
        add(boton_AD);
    }

    public void actionPerformed(ActionEvent a) {
        if (e.getSource() == boton1) {
            Clientes clientes1 = new Clientes();
        }
        if (e.getSource() == boton2) {
            Facturas factura1 = new Facturas();
        }
        if (e.getSource() == boton3) {

        }
    }

    public static void main(String[] args) throws Exception {
        formulario_principal formulario_principal1 = new formulario_principal();
    }

}