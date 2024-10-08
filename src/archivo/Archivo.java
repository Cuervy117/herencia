/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import dispositivos.DispositivoElectronico;
import inventario.Inventario;
import productos.*;

public class Archivo{

    public static void almacenarProductos(Inventario inventario) throws IOException {
        int ram;
        int autonomia;
            try {
                Path packageActual = Paths.get(Archivo.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
                Path directorio = packageActual.resolve("archivo");
                Path ruta = directorio.resolve("Productos.txt");
                System.out.println("Ruta calculada del archivo: " + ruta.toString());

                if (!Files.exists(directorio)) {
                    Files.createDirectories(directorio);
                    System.out.println("Directorio creado: " + directorio.toString());
                }

                if (!Files.exists(ruta)) {
                    Files.createFile(ruta);
                    System.out.println("Archivo creado: " + ruta.toString());
                }

                // Lee el archivo si ya existe
                try (BufferedReader lector = new BufferedReader(new FileReader(ruta.toFile()))) {
                    String linea;
                    while ((linea = lector.readLine()) != null) {
                        String[] bloques = linea.split("\t"); // separa cada elemento que esté tabulado

                        // Suponiendo que los bloques están en el orden correcto
                        int id = Integer.parseInt(bloques[0]);
                        String tipo = bloques[1];
                        String nombre = bloques[2];
                        String marca = bloques[2];
                        String procesador = bloques[3];
                        String gama = bloques[4];
                        String sistemaOperativo = bloques[5];
                        boolean funcional = Boolean.parseBoolean(bloques[6].equals("")? "0":bloques[6]);
                        int pantalla = Integer.parseInt(bloques[7].equals("")? "0":bloques[7]);
                        try {
                            ram = Integer.parseInt(bloques[8].equals("") ? "0" : bloques[8]);
                        } catch (NumberFormatException e) {
                            ram = 0;
                        }

                        int almacenamiento = Integer.parseInt(bloques[9].equals("")? "0":bloques[9]);
                        int precio = Integer.parseInt(bloques[10].equals("")? "0":bloques[10]);
                        try {
                            autonomia = Integer.parseInt(bloques[11].equals("")? "0":bloques[11]);
                        } catch (NumberFormatException e) {
                            autonomia = 0;
                        }
                        int peso = Integer.parseInt(bloques[12].equals("")? "0":bloques[12]);
                        String dimensiones = bloques[13];
                        String color = bloques[14];
                        boolean apruebaDeAguaPolvo = Boolean.parseBoolean(bloques[15].equals("")? "0":bloques[15]);
                        String instalacion = bloques[16];

                        // Crear un nuevo producto según su tipo
                        DispositivoElectronico nuevoProducto = null;
                        nuevoProducto = switch (tipo) {
                            case "CamaraDigital" -> new CamaraDigital(precio, autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, 
                                    pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
                            case "Computadora" -> new Computadora(precio, pantalla, ram, almacenamiento, nombre, marca, procesador, 
                                    gama, sistemaOperativo, instalacion);
                            case "Consola" -> new Consola(precio, pantalla, ram, almacenamiento, nombre, marca, procesador, 
                                    gama, sistemaOperativo, instalacion);
                            case "ConsolaPortable" -> new ConsolaPortable(precio, autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, 
                                    pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
                            case "Impresora" -> new Impresora(precio, pantalla, ram, almacenamiento, nombre, marca, procesador, 
                                    gama, sistemaOperativo, instalacion);
                            case "Laptop" -> new Laptop(precio, autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, 
                                    pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
                            case "ReproductorVideo" -> new ReproductorVideo(precio, pantalla, ram, almacenamiento, nombre, marca, 
                                    procesador, gama, sistemaOperativo, instalacion);
                            case "SistemaAudio" -> new SistemaAudio(precio, pantalla, ram, almacenamiento, nombre, marca, 
                                    procesador, gama, sistemaOperativo, instalacion);
                            case "Smartphone" -> new Smartphone(precio, autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, 
                                    pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
                            case "Smartwatch" -> new Smartwatch(precio, autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, 
                                    pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
                            case "Tablet" -> new Tablet(precio, autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, 
                                    pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
                            case "Television" -> new Television(precio, pantalla, ram, almacenamiento, nombre, marca, procesador, 
                                    gama, sistemaOperativo, instalacion);
                            default -> {
                                yield null; // Retorna null si no se encuentra un tipo válido
                            }
                        };



                        if (nuevoProducto != null) {
                            // Agrega el nuevo producto al inventario
                            inventario.agregarProducto(nuevoProducto);
                        } else {
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo: " + e.getMessage());
                }
            } catch (URISyntaxException e) {
                System.out.println("Error al determinar la ruta del archivo: " + e.getMessage());
            }
        }

}
