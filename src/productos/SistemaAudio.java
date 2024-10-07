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
public class SistemaAudio extends DispositivoEstacionario {

    public SistemaAudio(int precio, int pantalla, int ram, int almacenamiento, String nombre, String marca, String procesador, String gama, String sistemaOperativo, String instalacion) {
        super(precio, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo, instalacion);
    }

    public SistemaAudio(String nombre, int precio) {
        super(nombre, precio);
    }


    
    @Override
    public void encender() {
        System.out.println("Encendiendo sistema de audio...");
    }
    

    @Override
    public void apagar() {
        System.out.println("Apagando sistema de audio...");
    }

    @Override
    public void reparar() {
        System.out.println("Reparando sistema de audio...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando sistema de audio...");
    }
    
}
