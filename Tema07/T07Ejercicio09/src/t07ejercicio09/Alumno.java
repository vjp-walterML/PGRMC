package t07ejercicio09;

/**
 *
 * @author Walter
 */
public class Alumno {

    private String nombreAlumno;
    private Asignatura[] notas;

    public Alumno() {
        nombreAlumno = "";
        notas = new Asignatura[4];
    }

    public Alumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
        notas = new Asignatura[4];
    }

    public Alumno(String nombreAlumno, Asignatura[] notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas = notas;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

}
