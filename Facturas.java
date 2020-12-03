//AUTHOR:
//DATE:
//DESCRIPTION:

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Facturas extends JFrame implements ActionListener {
    JLabel label1, label2, label3, label4, label5;
    JButton boton1, boton2, boton3;
    JTextField n_fac, fecha, cliente, v_total, kv;

    public Facturas() {
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Facturas");

        label2 = new JLabel("Nro Factura:");
        label2.setBounds(30, 20, 360, 30);
        add(label2);
        n_fac = new JTextField();
        n_fac.setBounds(140, 22, 50, 25);
        add(n_fac);

        label3 = new JLabel("Fecha limite:");
        label3.setBounds(30, 60, 360, 30);
        add(label3);
        fecha = new JTextField();
        fecha.setBounds(140, 62, 230, 25);
        add(fecha);

        label4 = new JLabel("Cliente:");
        label4.setBounds(30, 100, 360, 25);
        add(label4);
        cliente = new JTextField();
        cliente.setBounds(140, 102, 230, 25);
        add(cliente);

        label5 = new JLabel("Valor Total:");
        label5.setBounds(30, 140, 360, 25);
        add(label5);
        v_total = new JTextField();
        v_total.setBounds(140, 142, 140, 25);
        add(v_total);

        label1 = new JLabel("Consumo KV:");
        label1.setBounds(210, 20, 360, 25);
        add(label1);
        kv = new JTextField();
        kv.setBounds(310, 22, 50, 25);
        add(kv);

        boton1 = new JButton("Guardar");
        boton1.setBounds(315, 200, 130, 30);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Imprimir");
        boton2.setBounds(170, 200, 130, 30);
        boton2.addActionListener(this);
        add(boton2);

        boton3 = new JButton("Ver detalles");
        boton3.setBounds(30, 200, 130, 30);
        boton3.addActionListener(this);
        add(boton3);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            Menu menu1 = new Menu();
        }
        if (e.getSource() == boton2) {

        }
        if (e.getSource() == boton2) {

        }
    }

    public static void main(String[] args) throws Exception {
        Facturas factura1 = new Facturas();
    }

}