/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

import inventario.Inventario;

/**
 *
 * @author david
 */
public class VIP extends Comprador {
    
    public VIP(String nombre) {
        super(nombre);
        productos.putAll(Inventario.getInventario().getProductosVIP());
    }
    
    public VIP(String nombre, int saldo){
        super(nombre, saldo);
        productos.putAll(Inventario.getInventario().getProductosVIP());
    }
    
    public void mostrarDescuentos(){
        Inventario.getInventario().getDescuentos().forEach((id, producto) -> {
        double precioConDescuento = producto.getPrecio() - (producto.getPrecio() * descuentoDeTemporada);
        System.out.println("Producto con ID: " + id + " " + producto.getNombre() + " de precio " + producto.getPrecio() + " ahora en " + precioConDescuento);
        });
    }
    
    @Override
    public void comprar(){
        double[] total = {0};
        System.out.println("Generando ticket de " + this.getNombre() + "...");
        System.out.println("Producto    Precio      Descuento");
        carrito.forEach(producto -> System.out.println(producto.getNombre() + "     " + producto.getPrecio() + "    -" + (Inventario.getInventario().getDescuentosParaEstudiantes().containsKey(producto.getID())? producto.getPrecio()*descuentoDeTemporada : 0)));
        carrito.forEach(producto -> {total[0] += (Inventario.getInventario().getDescuentos().containsKey(producto.getID())? producto.getPrecio() - producto.getPrecio()*descuentoDeTemporada : producto.getPrecio());});
        System.out.println("Total:      " + total[0]);
        
    }
}
