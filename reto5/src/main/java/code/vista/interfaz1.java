package code.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import code.vo.consulta1vo;

import java.awt.*;
import java.util.ArrayList;

public class interfaz1 extends JFrame {
    JTable tabla;
    DefaultTableModel modelo;
    JPanel panelg;
    JScrollPane scrollpane;

    public interfaz1(){
        setTitle("Primer Informe");
        setSize(500,500);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        panelg = new JPanel();
        panelg.setBackground(new Color(247, 234, 197));

        // tabla
        String[] columnas = {"ID", "NOMBRE", "APELLIDO", "CIUDAD"};
        ArrayList<String[]> data_vo = consulta1vo.valores();
        // recorro el array list y lo almaceno en srting datos[] y datos se carga al modelo y eso a su vez se carga a la tabla
        String[][] datos = new String[data_vo.size()][4];

        for (int i = 0; i < data_vo.size(); i++) {
            int j=0;
            // for each
            for (String s : data_vo.get(i)) {
                datos[i][j] = s;
                j++;
            }
        }

        modelo = new DefaultTableModel(datos, columnas);
        tabla = new JTable(modelo);

        scrollpane = new JScrollPane(tabla);
        scrollpane.setBounds(20,20,460,420);
        add(scrollpane);

        add(panelg);
        setVisible(true);
    }
}
