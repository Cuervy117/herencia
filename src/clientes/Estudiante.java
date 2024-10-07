package clientes;

import inventario.*;

public class Estudiante extends Comprador {
    
    private final double descuento = 0.05;
    

    public Estudiante(String nombre){
        super(nombre);
        this.productos = Inventario.getInventario().getProductos();
    }
    
    public Estudiante(String nombre, int saldo){
        super(nombre, saldo);
        this.productos = Inventario.getInventario().getProductos();       
    }
    
    public void mostrarDescuentos(){
        Inventario.getInventario().getDescuentosParaEstudiantes().forEach((id, producto) -> System.out.println("Producto con ID: " + id + " " + producto.getNombre() + " de precio " + producto.getPrecio() + " ahora en " + (producto.getPrecio() - producto.getPrecio()*descuento)));
    }
    
    @Override
    public void comprar(){
        double[] total = {0};
        System.out.println("Generando ticket de " + this.getNombre() + "...");
        System.out.println("Producto    Precio      Descuento");
        carrito.forEach(producto -> System.out.println(producto.getNombre() + "     " + producto.getPrecio() + "    -" + (Inventario.getInventario().getDescuentosParaEstudiantes().containsKey(producto.getID())? producto.getPrecio()*descuento : 0)));
        carrito.forEach(producto -> {total[0] += (Inventario.getInventario().getDescuentosParaEstudiantes().containsKey(producto.getID())? producto.getPrecio() - producto.getPrecio()*descuento : producto.getPrecio());});
        System.out.println("Total:      " + total[0]);
        
    }
}
