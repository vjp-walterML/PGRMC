package t10ejercicio14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Test {

    public static int mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n"
                + "*************************************************\n"
                + "******************** M E N U ********************\n"
                + "*************************************************\n"
                + "1. Introducir un nuevo alumno junto a sus notas.\n"
                + "2. Mostrar los alumnos introducidos hasta el momento.\n"
                + "3. Mostrar mejor alumno de la clase (nota media mas alta).\n"
                + "4. Mostrar asignatura mas dificil (mayor numero de suspensos).\n"
                + "5. Salir.\n"
                + "--------------------------------------------------\n"
                + "Eliga una opcion: ");
        return entrada.nextInt();
    }

    public static void introducirAlumno(ArrayList<Alumno> alumnos) {
        Alumno alumno = new Alumno();
        alumno.rellenarAlumno();
        alumnos.add(alumno);
    }

    public static void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            alumno.mostrarAlumno();
        }
    }

    public static void mostrarAlumnosIt(ArrayList<Alumno> alumnos) {
        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()) {
            it.next().mostrarAlumno();
        }
    }

    public static void mejorAlumno(ArrayList<Alumno> alumnos) {
        Alumno mejorAlumno = alumnos.get(0);
        for (Alumno alumno : alumnos) {
            if (mejorAlumno.notaMedia() < alumno.notaMedia()) {
                mejorAlumno = alumno;
            }
        }
        mejorAlumno.mostrarAlumno();
    }

    public static void asignaturaMasDificil(ArrayList<Alumno> alumnos) {
        //Creo vector auxiliar para almacenar numero suspensos por asignaturas
        int[] numeroSuspensos = new int[alumnos.get(0).getAsignaturas().length];

        //Relleno numeroSuspensos
        for (int i = 0; i < alumnos.size(); i++) {
            //Creo vector asignaturas auxiliar
            Asignatura[] asignaturas = alumnos.get(i).getAsignaturas();
            for (int j = 0; j < asignaturas.length; j++) {
                if (asignaturas[j].getNota() < 5) {
                    numeroSuspensos[j] += 1;
                }
            }
        }

        //Busco cual es el numero de suspensos mas alto 
        int dificil = numeroSuspensos[0];
        for (int i = 0; i < numeroSuspensos.length; i++) {
            if (dificil < numeroSuspensos[i]) {
                dificil = numeroSuspensos[i];
            }
        }

        //muestro la asignatura con mayor numero suspensos
        int i = 0;
        while (i < numeroSuspensos.length && dificil != numeroSuspensos[i]) {
            i++;
        }
        System.out.println("La asignatura mas dificil es " + alumnos.get(0).getAsignaturas()[i].getNombre());

    }

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        int opcion;
        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("# AÑADIR NUEVO ALUMNO");
                    introducirAlumno(alumnos);
                    break;
                case 2:
                    if (!alumnos.isEmpty()) {
                        System.out.println("# MOSTRAR ALUMNOS");
                        mostrarAlumnos(alumnos);
                        //mostrarAlumnosIt(alumnos);
                    } else {
                        System.out.println("Error.Primero debes introducir algun alumno.");
                    }
                    break;
                case 3:
                    if (!alumnos.isEmpty()) {
                        System.out.println("# MEJOR ALUMNO");
                        mejorAlumno(alumnos);
                    } else {
                        System.out.println("Error.Primero debes introducir algun alumno.");
                    }
                    break;
                case 4:
                    if (!alumnos.isEmpty()) {
                        System.out.println("# ASIGNATURA MAS DIFICIL");
                        asignaturaMasDificil(alumnos);
                    } else {
                        System.out.println("Error.Primero debes introducir algun alumno.");
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Error.Introduzca un opcion valida.");

            }

        } while (opcion != 5);
    }
}
