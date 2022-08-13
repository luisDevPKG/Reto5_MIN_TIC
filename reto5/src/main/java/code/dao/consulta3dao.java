package code.dao;
import code.Utilidades.*;
import java.sql.*;

public class consulta3dao {
    public static ResultSet consulta(){
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        String consql = "SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra JOIN Proyecto USING(ID_Proyecto) WHERE Proveedor=='Homecenter' AND Ciudad=='Salento';";
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
