
package universidadejemplo;
//LA BASE DE DATOS EN LA CARPETA ORIGEN DEL PROYECTO
//PARA CREARLA EN phpMyAdmin hay que crear primero la base de datos con el mismo nombre sin las tablas, luego importar la base de datos.
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;
//PARA INICIAR ESTE MAIN, DESDE LOS PROYECTOS LE DAS A LA CLASE 'UniversidadEjemplo 2CLICK run file'
public class UniversidadEjemplo {
    //LOS NOMBRES DE LAS CONTANTES(final) VAN EN MAYUSCULAS

    private static final String URL = "jdbc:mariadb://localhost/universidadulp";//Puede sustituir mysql por mariadb
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    public static void main(String[] args) {
        try {
            //CARGAR DRIVER DE CONEXION
            Class.forName("org.mariadb.jdbc.Driver");
            
            //CONEXION A LA BASE DE DATOS: UTILIZANDO ATRIBUTOS DE LA CLASE
            Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            //---------------------------------------------------------------------------------------
            
            
            //AGREGAR UNA MATERIA A LA BASE DE DATOS
            /*
            String sql = "insert into materia (nombre, año, estado)"
                + " values ('Laboratorio 2', 2, true)";
            
            PreparedStatement ps = conn.prepareStatement(sql);
            int filas = ps.executeUpdate();
            //DEVUELVE UN int CON EL NUMERO DE FILAS AFECTADAS
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Materia agregada exitosamente");
            }
            */
            //---------------------------------------------------------------------------------------
            
            
            //AGREGAR UN ALUMNO A LA BASE DE DATOS
            /*
            String sql = "insert into alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "values (52745628, 'Lopez', 'Juan', '"
                    + LocalDate.of(2000, Month.AUGUST, 29) + "', true);";
            
            PreparedStatement ps = conn.prepareStatement(sql);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente");
            }
            */
            //---------------------------------------------------------------------------------------
            
            
            //OBTENER TODOS LOS ALUMNOS ACTIVOS Y LISTARLOS POR CONSOLA
            /*
            String sql = "select * from alumno where estado = true";
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {                
                System.out.println("id " + resultado.getInt("idAlumno"));
                System.out.println("DNI " + resultado.getInt("dni"));
                System.out.println("Apellido " + resultado.getString("apellido"));
                System.out.println("Nombre " + resultado.getString("nombre"));
                System.out.println("Fecha de nacimiento " + resultado.getDate("fechaNacimiento"));
                System.out.println("");
            }
            */
            
            
            //DAR DE BAJA A UN ALUMNO, CAMBIAR ESTADO DE true A false
            /*
            String sql = "update alumno set estado = false where dni = 52745628";
            
            PreparedStatement ps = conn.prepareCall(sql);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Alumno dado de baja exitosamente");
            }
            */
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Debe agregar los driver al proyecto!!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion!!");
            ex.printStackTrace();
        }
    }
    
}
