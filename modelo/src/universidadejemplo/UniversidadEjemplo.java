
package universidadejemplo;
//LA BASE DE DATOS EN LA CARPETA ORIGEN DEL PROYECTO
//PARA CREARLA EN phpMyAdmin hay que crear primero la base de datos con el mismo nombre sin las tablas, luego importar la base de datos.
import java.sql.*;
import javax.swing.JOptionPane;
//PARA INICIAR ESTE MAIN, DESDE LOS PROYECTOS LE DAS A LA CLASE 'UniversidadEjemplo 2CLICK run file'
public class UniversidadEjemplo {
    //LOS NOMBRES DE LAS CONTANTES(final) VAN EN MAYUSCULAS

    private static final String URL = "jdbc:mariadb://localhost/universidadulp";//Puede sustituir mysql por mariadb
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    public static void main(String[] args) {
        try {
            //CARGAR DIVER DE CONEXION
            Class.forName("org.mariadb.jdbc.Driver");
            
            //CONEXION A LA BASE DE DATOS: UTILIZANDO VARIABLES DE OBJETO
            Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            
            //AGREGAR MATERIA A LA BASE DE DATOS
            String sql = "insert into materia (nombre, año, estado) values ('Laboratorio 2', 2, true)";
            PreparedStatement ps = conn.prepareStatement(sql);
            int filas = ps.executeUpdate();
            //DEVUELVE UN int CON EL NUMERO DE FILAS AFECTADAS
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Materia agregada exitosamente");
            }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Debe agregar los driver al proyecto!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion!!");
        }
    }
    
}
