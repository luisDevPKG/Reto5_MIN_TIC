package code.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import code.vo.consulta3vo;

import java.awt.*;
import java.util.ArrayList;

public class interfaz3 extends JFrame{
    JTable tabla;
    DefaultTableModel modelo;
    JPanel panelg;
    JScrollPane scrollpane;

    public interfaz3(){
        setTitle("Tercer Informe");
        setSize(500,450);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        panelg = new JPanel();
        panelg.setBackground(new Color(197, 247, 247));

        // tabla
        String[] columnas = {"ID", "CONSTRUCTORA", "BANCO"};
        ArrayList<String[]> data_vo = consulta3vo.valores();
        // recorro el array list y lo almaceno en srting datos[] y datos se carga al modelo y eso a su vez se carga a la tabla
        String[][] datos = new String[data_vo.size()][3];

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
        scrollpane.setBounds(20,20,460,350);
        add(scrollpane);

        add(panelg);
        setVisible(true);
    }
}
