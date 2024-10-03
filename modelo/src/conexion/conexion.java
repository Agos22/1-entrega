package conexion;

import java.sql.*;

public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost:3306/escuela";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
     public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
    

