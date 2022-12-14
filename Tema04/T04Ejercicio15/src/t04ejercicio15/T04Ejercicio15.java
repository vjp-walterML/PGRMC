package t04ejercicio15;

import java.util.Scanner;

/**
 *
 * @author wmartinl01
 */
public class T04Ejercicio15 {

    public static int pedirNum1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer numero: ");
        int num1 = entrada.nextInt();

        return num1;
    }

    public static int pedirNum2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el segundo numero: ");
        int num2 = entrada.nextInt();

        return num2;
    }

    public static int mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("1.- Sumar los números.");
        System.out.println("2.- Restar los números.");
        System.out.println("3.- Multiplicar los números.");
        System.out.println("4.- Dividir los números.");
        System.out.println("5.- Salir del programa.");
        System.out.println("Por favor, introduzca una opción: ");
        opcion = entrada.nextInt();
        return opcion;
    }

    public static int sumarNumeros(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static int restarNumeros(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }

    public static int multiplicarNumeros(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }

    public static int dividirNumeros(int num1, int num2) {
        int resultado = 0;
        try {
            resultado = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        return resultado;
    }

    public static void main(String[] args) {
        int num1, num2, opcion;

        do {
            num1 = pedirNum1();
            num2 = pedirNum2();
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado es: "+sumarNumeros(num1, num2));
                    break;
                case 2:
                    System.out.println("El resultado es: "+restarNumeros(num1, num2));
                    break;
                case 3:
                    System.out.println("El resultado es: "+multiplicarNumeros(num1, num2));
                    break;
                case 4:
                    System.out.println("El resultado es: "+dividirNumeros(num1, num2));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("ERROR: El numero introducido no es una opcion de las contempladas.");
            }
        } while (opcion != 5);

    }

}
