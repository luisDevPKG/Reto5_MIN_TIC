package code.dao;
import code.Utilidades.*;
import java.sql.*;

public class consulta1dao {
    public static ResultSet consulta(){
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        String consql = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";
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
