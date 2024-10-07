package clientes;

import dispositivos.*;
import java.util.ArrayList;

public class Carrito {
    private ArrayList<DispositivoElectronico> productos;
    private int monto;
    
    public Carrito(){
        this.monto = 0;
        this.productos = new ArrayList<>();
    }

    public ArrayList<DispositivoElectronico> getProductos() {
        return productos;
    }
    

    public int getMonto() {
        return monto;
    }
    
    public void setProductos(ArrayList<DispositivoElectronico> productos) {
        this.productos = productos;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void generarMonto(){
        
    }

}
