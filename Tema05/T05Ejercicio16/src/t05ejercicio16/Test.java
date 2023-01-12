/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t05ejercicio16;

import java.util.Scanner;

/**
 *
 * @author wmartinl01
 */
public class Test {
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un nombre: ");
        return entrada.nextLine();
    }
    public static void main(String[] args) {
        
        //Creo 3 Alumnos
        Alumno alumno1 = new Alumno("Nacho", 8);
        Alumno alumno2 = new Alumno("Hugo", 5);
        Alumno alumno3 = new Alumno("Iker", 6);
        
    }
}
