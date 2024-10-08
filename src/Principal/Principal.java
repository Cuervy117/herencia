/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import inventario.Inventario;
import java.io.IOException;
import java.util.Scanner;
import productos.CamaraDigital;

/**
 *
 * @author david
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Inventario.getInventario().agregarDescuento(new CamaraDigital("Camara generica", 200));
        Menu.ejecutarMenu(sc);
    }
}
