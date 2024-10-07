package clientes;

import inventario.Inventario;

/**
 *
 * @author david
 */
public class Regular extends Comprador {
     
    public Regular(String nombre) {
        super(nombre);
    }
    
    public Regular(String nombre, int saldo){
        super(nombre, saldo);
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

    @Override
    public void mostrarExclusivos(Inventario inventario) {
        super.mostrarExclusivos(inventario);
        System.out.println("6) Camaras Digitales");
        System.out.println("7) Consolas Portables");
        System.out.println("8) Reproductores de video");
        System.out.println("9) Sistemas de audio");
        System.out.println("10) Smar Watches");
        System.out.println("11) Televisiones");
        System.out.println("Presione 0 para salir");
    }
}
