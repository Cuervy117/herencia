/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

import inventario.Inventario;

/**
 *
 * @author david
 */
public class VIP extends Comprador {
    
    public VIP(int saldo) {
        super(saldo);
        productos.putAll(Inventario.getInventario().getProductosVIP());
    }
    
}
