package clientes;

import java.util.ArrayList;
import dispositivos.DispositivoElectronico;
import inventario.Inventario;
import java.util.HashMap;

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
        carrito.forEach(producto -> {
            boolean contenidoEnDesEstudiantes = Inventario.getInventario().getDescuentosParaEstudiantes().containsKey(producto.getID());
            boolean contenidoEnDesRegulares = Inventario.getInventario().getDescuentos().containsKey(producto.getID());
            System.out.println(producto.getNombre() + "     " + producto.getPrecio() + "    -" + ((contenidoEnDesEstudiantes? producto.getPrecio()*descuento : 0) + (contenidoEnDesRegulares? producto.getPrecio()*descuentoDeTemporada : 0)));
        });
        carrito.forEach(producto -> {
            boolean contenidoEnDesEstudiantes = Inventario.getInventario().getDescuentosParaEstudiantes().containsKey(producto.getID());
            boolean contenidoEnDesRegulares = Inventario.getInventario().getDescuentos().containsKey(producto.getID());
            double precioConDescuento = producto.getPrecio() - producto.getPrecio()*descuento  - (producto.getPrecio() * (contenidoEnDesRegulares? descuentoDeTemporada: 0));
            total[0] += (contenidoEnDesEstudiantes? precioConDescuento : producto.getPrecio());
        });
        System.out.println("Total:      " + total[0]);
        
    }
}
