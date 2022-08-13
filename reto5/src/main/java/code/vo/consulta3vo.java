package code.vo;
import code.dao.*;
import java.sql.*;
import java.util.ArrayList;

public class consulta3vo {
    public static ArrayList<String[]> valores(){

        ArrayList<String[]> salida_vo = new ArrayList<String[]>();
        // se utiliza el arrylist ya que permite llenarlo de forma dinamica
        try {
            ResultSet rs = consulta3dao.consulta();
            while(rs.next()){
                int ID = rs.getInt("ID_Compra");
                String constructora = rs.getString("Constructora");
                String banco = rs.getString("Banco_Vinculado");
                // imprimo lo que se llena en el arreglo
                salida_vo.add(new String[]{ID+"",constructora,banco}); // ID+"" Lo convierte en cadena de caracteres ya que es un es un entero
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return salida_vo;
    }
}
