package clientes;

import dispositivos.DispositivoElectronico;
import inventario.Inventario;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Comprador {
    protected HashMap<Integer, DispositivoElectronico> productos = new HashMap<>();
    private ArrayList<Carrito> tickets;
    
    private Carrito carrito;
    private int saldo;
    
    public Comprador(int saldo){
        this.saldo = saldo;
        this.carrito = new Carrito();
    }
    
    protected HashMap<Integer, DispositivoElectronico> getProductos(){
        return productos;
    }
    
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public int getSaldo() {
        return saldo;
    }

    public void agregarAlCarrito(DispositivoElectronico e){
        carrito.getProductos().add(e);
    }

    public void agregarAlCarrito(DispositivoElectronico e, int descuento){
        carrito.getTablaPrecios().put(e, descuento);
    }

    public void comprar(){
       System.out.println("Felicidades por su compra!!"); 
       System.out.println();
    }

}
