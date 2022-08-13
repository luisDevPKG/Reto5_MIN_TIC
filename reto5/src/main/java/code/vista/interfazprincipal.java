package code.vista;

import javax.swing.*;
import java.awt.event.*;

public class interfazprincipal extends JFrame implements ActionListener {
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JPanel panelBotones;

    public interfazprincipal() {
        setTitle("Generar Informes");
        setResizable(false);
        setSize(500, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        boton1 = new JButton("Primer Informe");
        boton1.setBounds(20,20,150,30);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Segundo Informe");
        boton2.setBounds(180,20,150,30);
        boton2.addActionListener(this);
        add(boton2);

        boton3 = new JButton("Tercer Informe");
        boton3.setBounds(340,20,150,30);
        boton3.addActionListener(this);
        add(boton3);

        panelBotones = new JPanel();
        add(panelBotones);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == boton1){
            new interfaz1();
        }
        if (e.getSource() == boton2){
            new interfaz2();
        }
        if (e.getSource() == boton3){
            new interfaz3();
        }
    }
}
