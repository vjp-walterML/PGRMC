/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t02ejercicio21;

import java.util.Scanner;
/**
 *
 * @author Walter Martín Lopes
 */
public class T02Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca un número de segundos: ");
        int tiempo = entrada.nextInt();
        
        int horas= tiempo/3600;
        int minutos = (tiempo%3600)/60;
        int segundos = tiempo%60;
        
        System.out.println(tiempo+" segundos hacen un total de: "+horas+" horas, "+minutos+" minutos y "+segundos+ " segundos.");
    }
    
}
