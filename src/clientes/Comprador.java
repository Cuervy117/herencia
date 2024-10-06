package clientes;

import dispositivos.DispositivoElectronico;

public class Comprador {
    private Carrito carrito;
    private int saldo;
    //private ArrayList<Carrito> tickets;
    public Comprador(int saldo, DispositivoElectronico producto){
        this.saldo = saldo;
        this.carrito = new Carrito(producto);
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
