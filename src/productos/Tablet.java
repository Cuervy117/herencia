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
public class Tablet extends DispositivoMovil {

    public Tablet(int precio, int autonomia, int peso, String dimensiones, String color, boolean aprueba_de_agua_polvo, int pantalla, int ram, int almacenamiento, String nombre, String marca, String procesador, String gama, String sistemaOperativo) {
        super(precio, autonomia, peso, dimensiones, color, aprueba_de_agua_polvo, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
    }

    public Tablet(String nombre, int precio) {
        super(nombre, precio);
    }


    
    @Override
    public void encender() {
        System.out.println("Encendiendo tablet...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando tablet...");
    }

    @Override
    public void reparar() {
        System.out.println("Reparando tablet...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando tablet...");
    }
    
}
