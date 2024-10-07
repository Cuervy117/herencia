/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import clientes.Comprador;
import clientes.Estudiante;
import inventario.Inventario;
import java.util.Scanner;
import productos.*;
/**
 *
 * @author david
 */


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Impresora impre = new Impresora("impreprueba", 400);
        Inventario.getInventario().agregarProducto(new Computadora("compu1", 200));
        Inventario.getInventario().agregarProducto(new Computadora("compu1", 200));
        Inventario.getInventario().agregarProducto(new Computadora("compu1", 200));
        Inventario.getInventario().agregarProducto(new Computadora("compu1", 200));
        Inventario.getInventario().agregarProducto(new Computadora("compu1", 200));
        Inventario.getInventario().agregarProducto(new Impresora("impre1", 400));
        Inventario.getInventario().agregarProducto(new Impresora("impre1", 400));
        Inventario.getInventario().agregarProducto(new Impresora("impre1", 400));
        Inventario.getInventario().agregarProducto(new Impresora("impre1", 400));
        Inventario.getInventario().agregarProducto(new Impresora("impre1", 400));
        Inventario.getInventario().agregarProducto(new Impresora("impre1", 400));
        Inventario.getInventario().agregarProducto(impre);
        Inventario.getInventario().agregarDescuento(impre);
        Estudiante estu1 = new Estudiante("pedro");
        
        Inventario.getInventario().getProductos().forEach((id, producto) -> {
            System.out.println(producto.getNombre());
            estu1.agregarAlCarrito(id);
        });
        estu1.mostrarDescuentos();
        estu1.comprar();
        Comprador.menuDeProductos(sc);
    }
}
