/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos.tipos;

import dispositivos.DispositivoElectronico;

/**
 *
 * @author david
 */
public abstract class DispositivoMovil extends DispositivoElectronico {
    protected int autonomia;
    protected int peso;
    protected String dimensiones;
    protected String color;
    protected boolean aprueba_de_agua_polvo;

    public DispositivoMovil(int precio, int autonomia, int peso, String dimensiones, String color, boolean aprueba_de_agua_polvo, int pantalla, int ram, int almacenamiento, String nombre, String marca, String procesador, String gama, String sistemaOperativo) {
        super(precio, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
        this.autonomia = autonomia;
        this.peso = peso;
        this.dimensiones = dimensiones;
        this.color = color;
        this.aprueba_de_agua_polvo = aprueba_de_agua_polvo;
    }
    
    public DispositivoMovil(String nombre, int precio){
        super(nombre, precio);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getAutonomia() {
        return autonomia;
    }

    public float getPeso() {
        return peso;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public String getColor() {
        return color;
    }

    public boolean isAprueba_de_agua_polvo() {
        return aprueba_de_agua_polvo;
    }
    // </editor-fold>
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Autonomia de " + autonomia + " horas");
        System.out.println("Peso: " + peso);
        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Color: " + color);
        System.out.println(aprueba_de_agua_polvo == true? "Aprueba de agua y polvo" : "No es aprueba de agua y polvo");
    }
    
}
