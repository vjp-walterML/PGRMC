/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t05ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Test {

    public static String pedirNombre() {
        Scanner nombre = new Scanner(System.in);

        System.out.println("Por favor, introduzca el nombre del empleado: ");
        return nombre.nextLine();
    }

    public static int pedirHorasTrabajadas() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ahora,introduzca las horas trabajadas: ");
        return entrada.nextInt();
    }

    public static int pedirTarifaPorHora() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por ultimo,introduzca la tarifa por hora: ");
        return entrada.nextInt();
    }

    public static void mostrarSueldoBruto(Empleado empleado) {
        int horasTrabajadas = empleado.getHorasTrabajadas();
        int tarifaHora = (int) empleado.getTarifaPorHora();
        double tarifaHoraExtra = tarifaHora * 1.5;
        double sueldoBruto = 0;
        
        //Calculo
        if (horasTrabajadas <= 40) {
            sueldoBruto = horasTrabajadas * tarifaHora;
        } else {
            sueldoBruto = (40 * tarifaHora) + ((horasTrabajadas - 40) * tarifaHoraExtra);
        }
        
        //Muestro resultado
        System.out.println(empleado.getNombre() + " trabajo " + horasTrabajadas + " horas, cobra " + tarifaHora + " euros la hora por lo que le corresponde un sueldo de " + Math.round(sueldoBruto) + " euros.");

    }

    public static void main(String[] args) {
        //Creo 3 Empleados
        Empleado empleado1 = new Empleado(pedirNombre(), pedirHorasTrabajadas(), pedirTarifaPorHora());
        Empleado empleado2 = new Empleado(pedirNombre(), pedirHorasTrabajadas(), pedirTarifaPorHora());
        Empleado empleado3 = new Empleado(pedirNombre(), pedirHorasTrabajadas(), pedirTarifaPorHora());

        //Muestro el sueldo bruto
        mostrarSueldoBruto(empleado1);
        mostrarSueldoBruto(empleado2);
        mostrarSueldoBruto(empleado3);
    }
}
