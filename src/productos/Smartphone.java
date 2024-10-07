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
public class Smartphone extends DispositivoMovil {

    public Smartphone(int autonomia, int peso, String dimensiones, String color, boolean aprueba_de_agua_polvo, int pantalla, int ram, int almacenamiento, String nombre, String marca, String procesador, String gama, String sistemaOperativo) {
        super(autonomia, peso, dimensiones, color, aprueba_de_agua_polvo, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
    }

    public Smartphone(String nombre, int precio) {
        super(nombre, precio);
    }  
    
    @Override
    public void encender() {
        System.out.println("Encendiendo celular...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando celular...");
    }

    @Override
    public void reparar() {
        System.out.println("Reparando celular...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando celular...");
    }
    
}
