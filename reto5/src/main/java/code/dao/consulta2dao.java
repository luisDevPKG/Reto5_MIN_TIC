package code.dao;
import code.Utilidades.*;
import java.sql.*;

public class consulta2dao {
    public static ResultSet consulta(){
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        String consql = "SELECT ID_Proyecto,Constructora,Numero_Habitaciones,Ciudad FROM Proyecto WHERE Clasificacion=='Casa Campestre' AND Ciudad IN('Santa Marta','Barranquilla','Cartagena');";
        try {
            conn = JDBCUtilities.conexion();
            stmt = conn.createStatement();
            rs =stmt.executeQuery(consql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
}
