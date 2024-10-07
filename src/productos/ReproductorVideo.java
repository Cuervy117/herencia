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
public class ReproductorVideo extends DispositivoEstacionario {

    public ReproductorVideo(int pantalla, int ram, int almacenamiento, String nombre, String marca, String procesador, String gama, String sistemaOperativo, String instalacion) {
        super(pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo, instalacion);
    }

    public ReproductorVideo(String nombre, int precio) {
        super(nombre, precio);
    }
    
    @Override
    public void encender() {
        System.out.println("Encendiendo Reproductor...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando Reproductor...");
    }

    @Override
    public void reparar() {
        System.out.println("Reparando Reproductor...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando Reproductor...");
    }
    
}
