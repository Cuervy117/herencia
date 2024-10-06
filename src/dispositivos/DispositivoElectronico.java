/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author david
 */
public abstract class DispositivoElectronico implements Dispositivo {
    protected int pantalla;
    protected int ram;
    protected int almacenamiento;
    private final int id;
    
    protected String nombre;
    protected String marca;
    protected String procesador;
    protected String gama;
    protected String so;
    
    
    protected DispositivoElectronico(){
        this.id = this.hashCode();
    }
    
    public String consultarDatos(){
        return "papu";
    }
    
    public int consultarID(){
        return id;
    }
}
