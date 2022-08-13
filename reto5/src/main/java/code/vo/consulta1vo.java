package code.vo;
import code.dao.*;
import java.sql.*;
import java.util.ArrayList;

public class consulta1vo {
    public static ArrayList<String[]> valores(){

        ArrayList<String[]> salida_vo = new ArrayList<String[]>();
        // se utiliza el arrylist ya que permite llenarlo de forma dinamica

        try {
            ResultSet rs = consulta1dao.consulta();
            while(rs.next()){
                int ID = rs.getInt("ID_Lider");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Primer_Apellido");
                String ciudad = rs.getString("Ciudad_Residencia");
                // imprimo lo que se llena en el arreglo
                salida_vo.add(new String[]{ID+"",nombre,apellido,ciudad}); // ID+"" Lo convierte en cadena de caracteres ya que es un es un entero

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return salida_vo;
    }
}
