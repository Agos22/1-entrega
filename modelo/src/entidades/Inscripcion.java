
package modelo;


public class Inscripcion {
   private  int idInscripcion; 
    private double nota;
    private Alumno alumno;
    private materia Materia;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, double nota, Alumno alumno, materia Materia) {
        this.idInscripcion = idInscripcion;
        this.nota = nota;
        this.alumno = alumno;
        this.Materia = Materia;
    }

    public Inscripcion(double nota, Alumno alumno, materia Materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.Materia = Materia;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public materia getMateria() {
        return Materia;
    }

    public void setMateria(materia Materia) {
        this.Materia = Materia;
    }
    
   @Override
    public String toString(){
    
       String inscr= idInscripcion + alumno.getApellido()+ alumno.getNombre() + Materia.getNombre();
       return inscr;
    
    }
}
