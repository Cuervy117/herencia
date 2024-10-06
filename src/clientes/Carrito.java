package clientes;

import dispositivos.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
public class Carrito {
    private ArrayList<DispositivoElectronico> productos;
    private LinkedHashMap<DispositivoElectronico, Integer> tablaPrecios;
    private int monto;
    
    public Carrito(DispositivoElectronico producto){
        this.monto = 0;
        this.productos = new ArrayList<>();
        this.tablaPrecios = new LinkedHashMap<>();
        this.productos.add(producto);
    }

    public ArrayList<DispositivoElectronico> getProductos() {
        return productos;
    }
    
    public LinkedHashMap<DispositivoElectronico, Integer> getTablaPrecios() {
        return tablaPrecios;
    }

    public int getMonto() {
        return monto;
    }
    
    public void setTablaPrecios(LinkedHashMap<DispositivoElectronico, Integer> tablaPrecios) {
        this.tablaPrecios = tablaPrecios;
    }
    
    public void setProductos(ArrayList<DispositivoElectronico> productos) {
        this.productos = productos;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void verCarrito(){
        tablaPrecios.forEach((dispositivo, precio) -> System.out.println(dispositivo.getNombre() + " - " + precio) );
    }




}
