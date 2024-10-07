package clientes;

import java.util.ArrayList;
import java.util.List;
import dispositivos.DispositivoElectronico;
import inventario.*;
import java.util.Scanner;

public class Estudiante extends Comprador {
    // propuesta David
    
    
    
    // termina propuesta
    //private List<DispositivoElectronico> descuentos;
    private float descuento;
    

    public Estudiante(int saldo){
        super(saldo);
        this.descuento = (float) (1 - 0.05); // Que tengan 5 por ciento o ahí vemos

    }


    public void agregarAlCarrito(DispositivoElectronico producto, float descuento){
        this.getCarrito().getProductos().add(producto);
        producto.setPrecio(producto.getPrecio()*descuento);
    }
}
