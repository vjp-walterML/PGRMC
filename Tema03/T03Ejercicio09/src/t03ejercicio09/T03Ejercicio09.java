/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03ejercicio09;
import java.util.Scanner;
/**
 *
 * @author wmartinl01
 */
public class T03Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Declaro variables
        String numero,uno,dos,tres,cuatro;
        int aux,num1,num2,num3,num4;
        
        //Pido el numero de 4 cifras
        System.out.println("Por favor, indique un número de 4 cifras:");
        numero=entrada.nextLine();
        
        //Separo los numeros
        uno = numero.substring(0, 1);
        dos = numero.substring(1, 2);
        tres = numero.substring(2, 3);
        cuatro = numero.substring(3, 4);
        
        //Convierto los numeros en String a tipo int para ordenarlos
        num1 = Integer.parseInt(uno);
        num2 = Integer.parseInt(dos);
        num3 = Integer.parseInt(tres);
        num4 = Integer.parseInt(cuatro);
        
        //Los ordeno mediante el método de la burbuja, tengo que repetir el ciclo 3 veces
        
        //Ciclo 1
        if (num1>num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num2>num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if (num3>num4){
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        //Ciclo 2
        if (num1>num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num2>num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if (num3>num4){
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        //Ciclo 3
        if (num1>num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num2>num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if (num3>num4){
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        //Muestro por pantalla los números ordenados
        
        System.out.println("El orden de los numeros introducidos es el: "+num1+" - "+num2+" - "+num3+" - "+num4);
    }
    
}
