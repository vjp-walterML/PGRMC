/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t05ejercicio21;

/**
 *
 * @author Walter
 */
public class Cuenta {

    protected float saldo;
    private static int numCuentas;

    public Cuenta() {
        saldo = 0;
        numCuentas++;
    }

    public Cuenta(float saldo) {
        this.saldo = saldo;
        numCuentas++;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public static int getNumCuentas() {
        return numCuentas;
    }

    public void ingresar(float cantidad) {
        saldo += cantidad;
    }

    public void extraer(float cantidad) {
        saldo -= cantidad;
    }

}
