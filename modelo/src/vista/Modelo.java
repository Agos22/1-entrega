
package vista;

import conexion.conexion;
import java.util.List;
import modelo.Alumno;
import persistencia.alumnoData;


public class Modelo {
    
    public static void main(String[] args) {
        
        conexion conex = new conexion();
        alumnoData aluData = new alumnoData(conex);

        Alumno alu = new Alumno(1, "Juan", "Pérez", 20, true);
        aluData.guardarAlumno(alu);

        List<Alumno> alumnos = aluData.obtenerAlumnos();
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
        
    }
    