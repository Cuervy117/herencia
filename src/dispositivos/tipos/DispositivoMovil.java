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
    
    @Override
    public String consultarDatos(){
        super.consultarDatos();
        return "papu";
    }
}
