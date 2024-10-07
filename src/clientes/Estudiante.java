package clientes;

import java.util.ArrayList;
import java.util.List;
import dispositivos.DispositivoElectronico;
import inventario.Inventario;
import java.util.HashMap;

public class Estudiante extends Comprador {
    private ArrayList<DispositivoElectronico> descuentos;
    private static int descuento = 5;
    

    public Estudiante(int saldo){
        super(saldo);
        this.descuentos = new ArrayList<>();
        this.productos = Inventario.getInventario().getProductos();
    }
    
    public void mostrarDescuentos(){
        descuentos.forEach(producto -> System.out.println(producto.getNombre() + " " + producto.getprecio()));
    }

    public void agregarAlCarrito(DispositivoElectronico producto){
        this.getCarrito().getProductos().add(producto);
        producto.setPrecio(producto.getPrecio()/descuento);
    }
}
