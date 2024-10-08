/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;
import productos.*;
import java.util.HashMap;
import dispositivos.DispositivoElectronico;
/**
 *
 * @author david
 */
public class Inventario {
    
    private static Inventario inventario;
    private HashMap<Integer, DispositivoElectronico> productos = new HashMap<>();
    private HashMap<Integer, DispositivoElectronico> productosVIP = new HashMap<>();
    
    private HashMap<Integer, DispositivoElectronico> descuentos = new HashMap<>();
    private HashMap<Integer, DispositivoElectronico> descuentosParaEstudiante = new HashMap<>();
    
    public Inventario(){}
    
    public static Inventario getInventario(){
        if(inventario == null){
            inventario = new Inventario();
        }
        return inventario;
    }
    
    public void agregarProducto(DispositivoElectronico nuevoProducto){
        if(nuevoProducto.getGama().equals("Alta")){
            productosVIP.put(nuevoProducto.getID(), nuevoProducto);
        }else{
            productos.put(nuevoProducto.getID(), nuevoProducto);
            if(nuevoProducto instanceof Impresora || nuevoProducto instanceof Laptop || nuevoProducto instanceof Tablet || nuevoProducto instanceof Smartphone){
                descuentosParaEstudiante.put(nuevoProducto.getID(), nuevoProducto);
            }
        }
    }
    
    public void agregarDescuento(DispositivoElectronico nuevoDescuento){
        productos.put(nuevoDescuento.getID(), nuevoDescuento);
        descuentos.put(nuevoDescuento.getID(), nuevoDescuento);
    }
    
    public void eliminarProducto(DispositivoElectronico productoAEliminar){
        productos.remove(productoAEliminar.getID());
        if(descuentosParaEstudiante.containsKey(productoAEliminar.getID())) descuentosParaEstudiante.remove(productoAEliminar.getID());
        if(descuentos.containsKey(productoAEliminar.getID())) descuentos.remove(productoAEliminar.getID());
    }
    
    public void eliminarDescuento(DispositivoElectronico descuentoAEliminar){
        descuentos.remove(descuentoAEliminar.getID());
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public HashMap<Integer, DispositivoElectronico> getProductos(){
        return productos;
    }
    
    public HashMap<Integer, DispositivoElectronico> getProductosVIP(){
        return productosVIP;
    }
    
    public HashMap<Integer, DispositivoElectronico> getDescuentos(){
        return descuentos;
    }
    
    public HashMap<Integer, DispositivoElectronico> getDescuentosParaEstudiantes(){
        return descuentosParaEstudiante;
    }
    
    public HashMap<Integer,DispositivoElectronico> getCamarasDigitales(){
        HashMap<Integer,DispositivoElectronico> camarasDigitales = new HashMap<>();
        for(Integer id : productos.keySet()){
            if(productos.get(id) instanceof CamaraDigital){
            camarasDigitales.put(id, productos.get(id));
            }
        }
        return camarasDigitales;
    }
    
    public HashMap<Integer,DispositivoElectronico> getComputadoras(){
        HashMap<Integer,DispositivoElectronico> computadoras = new HashMap<>();
        for(Integer id : productos.keySet()){
            if(productos.get(id) instanceof Computadora){
            computadoras.put(id, productos.get(id));
            }
        }
        return computadoras;
    }
    
    public HashMap<Integer,DispositivoElectronico> getConsolas(){
        HashMap<Integer,DispositivoElectronico> consolas = new HashMap<>();
        for(Integer id : productos.keySet()){
            if(productos.get(id) instanceof Consola){
            consolas.put(id, productos.get(id));
            }
        }
        return consolas;
    }
    
    public HashMap<Integer,DispositivoElectronico> getConsolaPortables(){
        HashMap<Integer,DispositivoElectronico> consolaPortables = new HashMap<>();
        for(Integer id : productos.keySet()){
            if(productos.get(id) instanceof ConsolaPortable){
            consolaPortables.put(id, productos.get(id));
            }
        }
        return consolaPortables;
    }
    
    public HashMap<Integer,DispositivoElectronico> getImpresoras(){
        HashMap<Integer,DispositivoElectronico> impresoras = new HashMap<>();
        for(Integer id : productos.keySet()){
            if(productos.get(id) instanceof Impresora){
            impresoras.put(id, productos.get(id));
            }
        }
        return impresoras;
    }
    
    public HashMap<Integer,DispositivoElectronico> getLaptops(){
        HashMap<Integer,DispositivoElectronico> laptops = new HashMap<>();
        for(Integer id : productos.keySet()){
            if(productos.get(id) instanceof Laptop){
            laptops.put(id, productos.get(id));
            }
        }
        return laptops;
    }
    
    public HashMap<Integer,DispositivoElectronico> getReproductoresDeVideo(){
        HashMap<Integer,DispositivoElectronico> reproductoresDeVideo = new HashMap<>();
        for(Integer id : productos.keySet()){
            if(productos.get(id) instanceof ReproductorVideo){
            reproductoresDeVideo.put(id, productos.get(id));
            }
        }
        return reproductoresDeVideo;
    }
    
    public HashMap<Integer,DispositivoElectronico> getSistemasDeAudio(){
        HashMap<Integer,DispositivoElectronico> sistemasDeAudio = new HashMap<>();
        for(Integer id : productos.keySet()){
            if(productos.get(id) instanceof SistemaAudio){
            sistemasDeAudio.put(id, productos.get(id));
            }
        }
        return sistemasDeAudio;
    }
    
    public HashMap<Integer,DispositivoElectronico> getSmartwatchs(){
        HashMap<Integer,DispositivoElectronico> smartwatchs = new HashMap<>();
        for(Integer id : productos.keySet()){
            if(productos.get(id) instanceof Smartwatch){
            smartwatchs.put(id, productos.get(id));
            }
        }
        return smartwatchs;
    }
    
    public HashMap<Integer,DispositivoElectronico> getTablets(){
        HashMap<Integer,DispositivoElectronico> tablets = new HashMap<>();
        for(Integer id : productos.keySet()){
            if(productos.get(id) instanceof Tablet){
            tablets.put(id, productos.get(id));
            }
        }
        return tablets;
    }
    
    public HashMap<Integer,DispositivoElectronico> getSmartphones(){
        HashMap<Integer,DispositivoElectronico> smartphones = new HashMap<>();
        for(Integer id : productos.keySet()){
            if(productos.get(id) instanceof Smartphone){
            smartphones.put(id, productos.get(id));
            }
        }
        return smartphones;
    }
    
    public HashMap<Integer,DispositivoElectronico> getTelevisiones(){
        HashMap<Integer,DispositivoElectronico> televisiones = new HashMap<>();
        for(Integer id : productos.keySet()){
            if(productos.get(id) instanceof Television){
            televisiones.put(id, productos.get(id));
            }
        }
        return televisiones;
    }
    // </editor-fold>
}
