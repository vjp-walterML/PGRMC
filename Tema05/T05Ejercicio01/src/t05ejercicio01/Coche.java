/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t05ejercicio01;

/**
 *
 * @author Walter
 */
public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void arrancarCoche() {
        this.motorEncendido = true;
        this.velocidad = 10;
    }

    public void apagarCoche() {
        this.motorEncendido = false;
        this.velocidad = 0;
    }
    
    public void acelerarCoche(){
        this.velocidad += 20;
    }
    
    public void frenarCoche(){
        this.velocidad -= 6;
    }
    
    public void getEstado(){
        System.out.println("----------ESTADO DE----------");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Color: "+this.color);
        System.out.println("Velocidad: "+this.velocidad);
        System.out.println("MotorEncendido: "+this.motorEncendido);
    }
}
