/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

import dispositivos.tipos.DispositivoEstacionario;

/**
 *
 * @author david
 */
public class Computadora extends DispositivoEstacionario {

    public Computadora(int pantalla, int ram, int almacenamiento, String nombre, String marca, String procesador, String gama, String sistemaOperativo, String instalacion) {
        super(pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo, instalacion);
    }

    public Computadora(String nombre, int precio){
        super(nombre, precio);
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
