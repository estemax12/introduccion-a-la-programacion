//AUTHOR:Mauricio Bravo y Esteban Gaona
//DATE:2-12-2020
//DESCRIPTION:proyecto final

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Clientes extends JFrame implements ActionListener {
    JLabel labelID, label_NYA, label_email, label_telefono;
    JButton boton_guardar;
    JTextField ID, Nombre, Direccion, telefono, estrato;

    public Clientes() {
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Clientes");

        label_ID = new JLabel("Identificación:");
        label_ID.setBounds(30, 20, 360, 30);
        add(label_ID);
        ID = new JTextField();
        ID.setBounds(140, 22, 230, 25);
        add(ID);

        label_NYA = new JLabel("Nombre y Apellido");
        label_NYA.setBounds(30, 60, 360, 30);
        add(label_NYA);
        Nombre = new JTextField();
        Nombre.setBounds(140, 62, 230, 25);
        add(Nombre);

        label_email = new JLabel("email");
        label_email.setBounds(30, 100, 360, 25);
        add(label_email);
        email = new JTextField();
        email.setBounds(140, 102, 230, 25);
        add(email);

        label_telefono = new JLabel("Telefono:");
        label_telefono.setBounds(30, 140, 360, 25);
        add(label_telefono);
        telefono = new JTextField();
        telefono.setBounds(140, 142, 140, 25);
        add(telefono);

        boton_guardar = new JButton("Guardar");
        boton_guardar.setBounds(150, 200, 150, 30);
        boton_guardar.addActionListener(this);
        add(boton1);

    }

    public void actionPerformed(ActionEvent a) {
        if (e.getSource() == boton1) {
            Menu menu1 = new Menu();
        }

    }

    public static void main(String[] args) throws Exception {
        Clientes clientes1 = new Clientes();
    }

}