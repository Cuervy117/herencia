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
    private int precio;
    private final int ID;
    
    protected String nombre;
    private String marca;
    protected String procesador;
    private String gama;
    protected String sistemaOperativo;
    private boolean funcional = true;
   

    public DispositivoElectronico(int pantalla, int ram, int almacenamiento, String nombre, String marca, String procesador, String gama, String sistemaOperativo) {
        this.pantalla = pantalla;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.ID = this.hashCode();
        this.nombre = nombre;
        this.marca = marca;
        this.procesador = procesador;
        this.gama = gama;
        this.sistemaOperativo = sistemaOperativo;
    }

    // <editor-fold defaultstate="collapsed" desc="Getteres">
    public int getPantalla() {
        return pantalla;
    }

    public int getRam() {
        return ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public int getID() {
        return ID;
    }

    public String getMarca() {
        return marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getGama() {
        return gama;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    
    
    public String consultarDatos(){
        return nombre + ", " + marca + ", " + gama + ", " + procesador + ", " + sistemaOperativo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getPrecio(){
        return precio;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }
    // </editor-fold>

    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Gama: " + gama);
        System.out.println("Procesador: " + procesador);
        System.out.println("SO: " + sistemaOperativo);
        System.out.println("ID: " + this.getID());
    }
    
}
