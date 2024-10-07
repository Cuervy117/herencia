/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import archivo.Archivo;
import clientes.Comprador;
import inventario.Inventario;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Menu {
    public static void mostrarMenu(){
        System.out.println("1   --- Cliente regular");
        System.out.println("2   --- Estudiante");
        System.out.println("3   --- VIP");
    }
    public static void ejecutarMenu(Scanner sc) throws IOException{
        Archivo.almacenarProductos(Inventario.getInventario());
        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();
        System.out.println("¿Que tipo de cliente eres?");
        mostrarMenu();
        int opcion = Integer.parseInt(sc.nextLine());
        switch(opcion){
            case 1 ->{
                System.out.println("Navega e ingresa el ID cuando desees agregar al carrito");
                Comprador.menuDeProductos(sc, nombre, "Regular");
            }
            case 2 ->{
                System.out.println("Navega e ingresa el ID cuando desees agregar al carrito");
                Comprador.menuDeProductos(sc, nombre, "Estudiante"); 
            }
            case 3 ->{
                System.out.println("Navega e ingresa el ID cuando desees agregar al carrito");
                Comprador.menuDeProductos(sc, nombre, "VIP");
            }
        }
    }
}
