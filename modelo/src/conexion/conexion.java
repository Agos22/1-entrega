package conexion;

import java.sql.*;
<<<<<<< Updated upstream

public class Conexion {
=======
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





public class conexion {
>>>>>>> Stashed changes
    
    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String BD = "gp2_universidadulp";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    
    private conexion (){}
    
    public static Connection getConexion() { //funcion
     if (connection == null){
     
         try {
             Class.forName("org.mariadb.jdbc.Driver");
             connection = DriverManager.getConnection(URL + BD, USUARIO, PASSWORD);
             JOptionPane.showMessageDialog(null,"conectado");
             
         } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"error al cargar los Driver");
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"error al conoectarse a la BD");
         }
                
     }
        return connection;
     
     }
    

   

    
    
    
    
<<<<<<< Updated upstream
     public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
=======
    
>>>>>>> Stashed changes
}
    

