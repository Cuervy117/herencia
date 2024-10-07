package clientes;

import dispositivos.DispositivoElectronico;
import inventario.Inventario;
import java.util.HashMap;

public class Comprador {
    // propuesta David
    private HashMap<Integer, DispositivoElectronico> productosDescuentosExclusivos;
    // termina propuesta
    private Carrito carrito;
    private int saldo;
    
    //private ArrayList<Carrito> tickets;
    public Comprador(int saldo){
        this.saldo = saldo;
        this.carrito = new Carrito();
    }
    
    // propuesta David
    protected HashMap<Integer, DispositivoElectronico> asignarProductosDescuentos(Inventario inventario){
        if(this instanceof Estudiante){// así para los otros dos
            HashMap<Integer, DispositivoElectronico> productos = new HashMap<>();
            productos.putAll(inventario.getImpresoras());
            productos.putAll(inventario.getLaptops());
            productos.putAll(inventario.getTablets());
            productos.putAll(inventario.getSmartphones());
            for(Integer id : productos.keySet()){// para quitar los gama alta
                if(productos.get(id).getGama().equals("Alta")) productos.remove(id);
            }
            return productos;
        }
        // Para VIP podemos mostrar unicamente los alta, quitando los baja y los media
        
        // y en regular unicamente mostrar todo el inventario sin mostrar los alta
        return null;
    }
    // Termina propuesta
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
