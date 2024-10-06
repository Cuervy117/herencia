package clientes;

import java.util.ArrayList;
import java.util.List;
import dispositivos.DispositivoElectronico;

public class Estudiante extends Comprador {
    private List<DispositivoElectronico> descuentos;
    private float descuento;

    public Estudiante(int saldo){
        super(saldo);
        this.descuentos = new ArrayList<>();
        this.descuento = (float) 0.05; // Que tengan 5 por ciento o ahí vemos
    }

    public void mostrarDescuentos(){
        descuentos.forEach(producto -> System.out.println(producto.getNombre() + " " + producto.getprecio()));
    }

    public void agregarAlCarrito(DispositivoElectronico producto){
        this.getCarrito().getProductos().add(producto);
        producto.setPrecio(producto.getPrecio()*(1 - descuento));
    }
}
