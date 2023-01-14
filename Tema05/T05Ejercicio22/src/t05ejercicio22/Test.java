/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t05ejercicio22;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Test {

    static float cesta = 0;

    public static void mostrarMenu(Producto producto1, Producto producto2, Producto producto3) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaLine = new Scanner(System.in);
        int unidades;
        String seguirComprando;
        boolean finalizarCompra = false;

        //Muestro menu
        while (!finalizarCompra) {
            System.out.println("===========BIENVENIDO A MI TIENDA DE MASCOTAS===========");
            System.out.println("Pulse 1 para comprar " + producto1.getNombre() + " cuyo precio es de " + producto1.getPrecio() + " euros y el stock es de " + producto1.getStock() + " unidades.");
            System.out.println("Pulse 2 para comprar " + producto2.getNombre() + " cuyo precio es de " + producto2.getPrecio() + " euros y el stock es de " + producto2.getStock() + " unidades.");
            System.out.println("Pulse 3 para comprar " + producto3.getNombre() + " cuyo precio es de " + producto3.getPrecio() + " euros y el stock es de " + producto3.getStock() + " unidades.");
            switch (entrada.nextInt()) {
                case 1:
                    System.out.println("Has elegido comprar " + producto1.getNombre() + ".");
                    System.out.println("¿Cuantas unidades desea?");
                    unidades = entrada.nextInt();

                    if (comprobarStock(producto1, unidades)) {
                        cesta += unidades * producto1.getPrecio();
                        producto1.setStock(producto1.getStock() - unidades);
                        System.out.println("¡Compra realizada con exito!");
                        System.out.println("¿Desea comprar otro producto?");
                        seguirComprando = entradaLine.nextLine();

                        if (seguirComprando.equals("no") || seguirComprando.equals("No")) {
                            finalizarCompra = true;
                        }
                    } else {
                        System.out.println("Lo sentimos, no disponemos de suficiente stock, actualmente disponemos de " + producto1.getStock() + " " + producto1.getNombre() + ".");
                    }
                    break;
                case 2:
                    System.out.println("Has elegido comprar " + producto2.getNombre() + ".");
                    System.out.println("¿Cuantas unidades desea?");
                    unidades = entrada.nextInt();

                    if (comprobarStock(producto2, unidades)) {
                        cesta += unidades * producto2.getPrecio();
                        producto2.setStock(producto2.getStock() - unidades);
                        System.out.println("¡Compra realizada con exito!");
                        System.out.println("¿Desea comprar otro producto?");
                        seguirComprando = entradaLine.nextLine();

                        if (seguirComprando.equals("no") || seguirComprando.equals("No")) {
                            finalizarCompra = true;
                        }
                    } else {
                        System.out.println("Lo sentimos, no disponemos de suficiente stock, actualmente disponemos de " + producto2.getStock() + " " + producto2.getNombre() + ".");
                    }
                    break;
                case 3:
                    System.out.println("Has elegido comprar " + producto3.getNombre() + ".");
                    System.out.println("¿Cuantas unidades desea?");
                    unidades = entrada.nextInt();

                    if (comprobarStock(producto3, unidades)) {
                        cesta += unidades * producto3.getPrecio();
                        producto3.setStock(producto3.getStock() - unidades);
                        System.out.println("¡Compra realizada con exito!");
                        System.out.println("¿Desea comprar otro producto?");
                        seguirComprando = entradaLine.nextLine();

                        if (seguirComprando.equals("no") || seguirComprando.equals("No")) {
                            finalizarCompra = true;
                        }
                    } else {
                        System.out.println("Lo sentimos, no disponemos de suficiente stock, actualmente disponemos de " + producto3.getStock() + " " + producto3.getNombre() + ".");
                    }
                    break;
                default:
                    System.out.println("ERROR: Por favor, introduzca una opción correcta.");
            }
        }
        System.out.println("El total de su compra asciende a " + cesta + " euros. Muchas gracias por su compra, vuelva cuando quiera.");
    }

    public static boolean comprobarStock(Producto producto, int unidades) {
        return unidades <= producto.getStock();
    }

    public static void main(String[] args) {
        //Creo 3 productos
        Producto producto1 = new Producto("Peces", 10, 40);
        Producto producto2 = new Producto("Tortugas", 4, 8);
        Producto producto3 = new Producto("Canarios", 15, 4);

        //Muestro menu
        mostrarMenu(producto1, producto2, producto3);
    }
}
