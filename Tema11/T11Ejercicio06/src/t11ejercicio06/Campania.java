/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11ejercicio06;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Walter
 */
public class Campania {

    private static Campania campaniaCorona;
    private String nombre;
    private Set<Donacion> donaciones;

    //CONSTRUCTORES
    private Campania() {
        nombre = "";
        donaciones = new TreeSet<>();
    }

    private Campania(String nombre, Set<Donacion> donaciones) {
        this.nombre = nombre;
        this.donaciones = donaciones;
    }

    //PATRON DE DISEÑO SINGLETON
    public static Campania getInstance() {
        if (campaniaCorona == null) {
            campaniaCorona = new Campania();
        }
        return campaniaCorona;
    }
    
    //==============================================
    
}
