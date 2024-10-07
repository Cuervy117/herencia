/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

import dispositivos.tipos.DispositivoMovil;

/**
 *
 * @author david
 */
public class CamaraDigital extends DispositivoMovil {
    
    
    public CamaraDigital(int autonomia, int peso, String dimensiones, String color, boolean apruebaDeAguaPolvo, 
    int pantalla, int ram, int almacenamiento, String nombre, String marca, 
    String procesador, String gama, String sistemaOperativo) {
super(autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
}

    
    @Override
    public void encender() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void apagar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reparar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reiniciar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
