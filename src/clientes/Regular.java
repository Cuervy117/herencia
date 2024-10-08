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
public class Regular extends Comprador {
    
    public Regular(String nombre) {
        super(nombre);
        this.productos = Inventario.getInventario().getProductos();
    }
    
    public Regular(String nombre, int saldo){
        super(nombre, saldo);
        this.productos = Inventario.getInventario().getProductos();
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
        carrito.forEach(producto -> {
            boolean contenidoEnDesRegulares = Inventario.getInventario().getDescuentos().containsKey(producto.getID());
            System.out.println(producto.getNombre() + "     " + producto.getPrecio() + "    -" + (contenidoEnDesRegulares? producto.getPrecio()*descuentoDeTemporada : 0));
        });
        carrito.forEach(producto -> {total[0] += (Inventario.getInventario().getDescuentos().containsKey(producto.getID())? producto.getPrecio() - producto.getPrecio()*descuentoDeTemporada : producto.getPrecio());});
        System.out.println("Total:      " + total[0]);
        
    }
    
}
