package code.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import code.vo.consulta2vo;

import java.awt.*;
import java.util.ArrayList;

public class interfaz2 extends JFrame{
    JTable tabla;
    DefaultTableModel modelo;
    JPanel panelg;
    JScrollPane scrollpane;

    public interfaz2(){
        setTitle("Segundo Informe");
        setSize(500,300);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        panelg = new JPanel();
        panelg.setBackground(new Color(247, 198, 197));

        // tabla
        String[] columnas = {"ID", "CONSTRUCTORA", "HABITACION", "CIUDAD"};
        ArrayList<String[]> data_vo = consulta2vo.valores();
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
        scrollpane.setBounds(20,20,460,230);
        add(scrollpane);

        add(panelg);
        setVisible(true);
    }
}
