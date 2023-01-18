/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t05ampliacion01;

/**
 *
 * @author Walter
 */
public class Arma {

    private String nombre;
    private boolean disponible;
    private static int numeroArmas;

    public Arma() {
        nombre = "";
        disponible = false;
        numeroArmas++;
    }

    public Arma(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
        numeroArmas++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public static int getNumeroArmas() {
        return numeroArmas;
    }

    public void usarArma() {
        if (disponible) {
            this.quitarSeguro();
            System.out.println("Utilizando arma.");
        }
    }

    public void quitarSeguro() {
        System.out.println("Quitando el seguro de " + nombre);
    }

}
