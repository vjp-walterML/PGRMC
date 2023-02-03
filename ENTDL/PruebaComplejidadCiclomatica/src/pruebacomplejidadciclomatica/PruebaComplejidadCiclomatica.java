/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebacomplejidadciclomatica;

/**
 *
 * @author Walter
 */
public class PruebaComplejidadCiclomatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = new int [7];
        int aux;
        for (int i = 0; i < vector.length-1; i++) {    //NODO1
            for (int j = 0; j < vector.length-1; j++) {  //NODO2
                if (vector[j]< vector[j+1]) { //NODO3
                    aux = vector[j];//NODO4
                    vector[j] = vector[j+1];//NODO5
                    vector[j+1] = aux;//NODO6
                }
            }//NODO7 FORJ
        }//NODO8 FORI
    }//NODO9 MAIN
    
}
