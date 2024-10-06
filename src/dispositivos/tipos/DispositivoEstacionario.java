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
public abstract class DispositivoEstacionario extends DispositivoElectronico {
    protected String instalacion;

    public DispositivoEstacionario(int pantalla, int ram, int almacenamiento, String nombre, String marca, String procesador, String gama, String sistemaOperativo, String instalacion) {
        super(pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
        this.instalacion = instalacion;
    }
    
    public String getInstalacion(){
        return instalacion;
    }
    
    
}
