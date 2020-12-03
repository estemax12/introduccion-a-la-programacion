//AUTHOR:Mauricio Bravo y Esteban Gaona
//DATE:2-12-2020
//DESCRIPTION:proyecto final

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Acerca_de extends JFrame implements ActionListener {
    JLabel desarrollador, facultad, correo, github, desarrollador1, facultad1, correo1, github1;

    public Acerca_de() {
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Acerca de");

        desarrollador = new JLabel("Desarrollador 1: Mauricio Bravo");
        desarrollador.setBounds(15, 20, 360, 30);

        facultad = new JLabel("Facultad: Ing.Sistemas");
        facultad.setBounds(15, 50, 360, 30);

        correo = new JLabel("Correo: hector.bravo@santoto.edu.co");
        correo.setBounds(15, 80, 360, 30);

        github = new JLabel("Github: https://github.com/Mauricio123-bravo/introduccion-a-programacion");
        github.setBounds(15, 110, 360, 30);

        add(github);
        add(correo);
        add(facultad);
        add(desarrollador);

        desarrollador1 = new JLabel("Desarrollador 2: Esteban Gaona");
        desarrollador1.setBounds(260, 20, 360, 30);

        facultad1 = new JLabel("Facultad: Ing.Sistemas");
        facultad1.setBounds(260, 50, 360, 30);

        correo1 = new JLabel("Correo: cesare.gaona@usantoto.edu.co");
        correo1.setBounds(260, 80, 360, 30);

        github1 = new JLabel("Github:https://github.com/estemax12/introduccion-a-la-programacion");
        github1.setBounds(260, 110, 360, 30);

        add(github1);
        add(correo1);
        add(facultad1);
        add(desarrollador1);

    }

    public static void main(String[] args) throws Exception {
        Acerca_de acerca_de1 = new Acerca_de();
    }
}