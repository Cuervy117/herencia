package clientes;

import java.util.ArrayList;
import java.util.List;
import dispositivos.DispositivoElectronico;
import inventario.Inventario;

public class Estudiante extends Comprador {
    // propuesta David
    
    
    
    
    // termina propuesta
    private List<DispositivoElectronico> descuentos;
<<<<<<< HEAD
    private float descuento;
=======
    private int descuento;
    
>>>>>>> 5445b74ed6ce2ac97134e657fd14e38a63a7c719

    public Estudiante(int saldo){
        super(saldo);
        this.descuentos = new ArrayList<>();
<<<<<<< HEAD
        this.descuento = (float) 0.05; // Que tengan 5 por ciento o ahí vemos
=======
        this.descuento = 5; // Que tengan 5 por ciento o ahí vemos. 
>>>>>>> 5445b74ed6ce2ac97134e657fd14e38a63a7c719
    }

    public void mostrarDescuentos(){
        descuentos.forEach(producto -> System.out.println(producto.getNombre() + " " + producto.getprecio()));
    }

    public void agregarAlCarrito(DispositivoElectronico producto){
        this.getCarrito().getProductos().add(producto);
        producto.setPrecio(producto.getPrecio()*(1 - descuento));
    }
}
