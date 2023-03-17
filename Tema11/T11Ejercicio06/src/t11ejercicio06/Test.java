/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11ejercicio06;

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
                + "1. Añadir donación. \n"
                + "2. Mostrar donaciones. \n"
                + "3. Mostrar donaciones por nombre de donante.\n"
                + "4. Mostrar número de donaciones. \n"
                + "5. Mostrar total dinero recaudado. \n"
                + "6. Ordenar donaciones (de mayor a menor importe de las donaciones) \n"
                + "7. Salir.");
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("=======APARCAR AUTOBUS=======");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("¡HASTA PRONTO!");
                    break;
                default:
                    System.out.println("ERROR. Introduzca una opcion valida.");
            }
        } while (opcion != 7);

    }
}
