package t10ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Alumno {

    private String nombre;
    private Asignatura[] asignaturas;

    public Alumno() {
        nombre = "";
        asignaturas = rellenarAsignaturas();
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        asignaturas = rellenarAsignaturas();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    //====================METODOS PROPIOS====================
    /*Método para rellenar el atributo asignaturas, es privado porque solo se puede usar en el constructor,
     *para añadir mas asignaturas a cada alumno solo es necesario cambiar el nombreMateria[]
     */
    private Asignatura[] rellenarAsignaturas() {
        String[] nombreMateria = {"Lengua", "Mates", "Fisica"};
        Asignatura[] materias = new Asignatura[nombreMateria.length];
        for (int i = 0; i < materias.length; i++) {
            materias[i] = new Asignatura(nombreMateria[i]);
        }
        return materias;
    }

    public void introducirNotas() {
        Scanner entrada = new Scanner(System.in);
        for (Asignatura a : asignaturas) {
            System.out.print(a.getNombre() + ": ");
            a.setNota(entrada.nextFloat());
            System.out.println("");//Salto de linea
        }
    }

    public void rellenarAlumno() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("");//Salto de linea
        this.introducirNotas();
    }

    public void mostrarAlumno() {
        System.out.println("=======" + nombre + "=======");
        for (Asignatura a : asignaturas) {
            System.out.println(a.getNombre() + ": " + a.getNota());
        }
    }

    public float notaMedia() {
        float media = 0;
        for (Asignatura a : asignaturas) {
            media += a.getNota();
        }
        return media / asignaturas.length;
    }
}
