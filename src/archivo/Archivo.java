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

public static void almacenarProductos(Inventario inventario) {
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
                    String nombre = bloques[1];
                    String marca = bloques[2];
                    String procesador = bloques[3];
                    String gama = bloques[4];
                    String sistemaOperativo = bloques[5];
                    boolean funcional = Boolean.parseBoolean(bloques[6]);
                    int pantalla = Integer.parseInt(bloques[7]);
                    int ram = Integer.parseInt(bloques[8]);
                    int almacenamiento = Integer.parseInt(bloques[9]);
                    float precio = Float.parseFloat(bloques[10]);
                    int autonomia = Integer.parseInt(bloques[11]);
                    float peso = Float.parseFloat(bloques[12]);
                    String dimensiones = bloques[13];
                    String color = bloques[14];
                    boolean apruebaDeAguaPolvo = Boolean.parseBoolean(bloques[15]);
                    String instalacion = bloques[16];

                    // Crear un nuevo producto según su tipo
                    DispositivoElectronico nuevoProducto = null;
                    nuevoProducto = switch (nombre) {
                        case "CamaraDigital" -> new CamaraDigital(autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, 
                                pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
                        case "Computadora" -> new Computadora(pantalla, ram, almacenamiento, nombre, marca, procesador, 
                                gama, sistemaOperativo, instalacion);
                        case "Consola" -> new Consola(pantalla, ram, almacenamiento, nombre, marca, procesador, 
                                gama, sistemaOperativo, instalacion);
                        case "ConsolaPortable" -> new ConsolaPortable(autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, 
                                pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
                        case "Impresora" -> new Impresora(pantalla, ram, almacenamiento, nombre, marca, procesador, 
                                gama, sistemaOperativo, instalacion);
                        case "Laptop" -> new Laptop(autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, 
                                pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
                        case "ReproductorVideo" -> new ReproductorVideo(pantalla, ram, almacenamiento, nombre, marca, 
                                procesador, gama, sistemaOperativo, instalacion);
                        case "SistemaAudio" -> new SistemaAudio(pantalla, ram, almacenamiento, nombre, marca, 
                                procesador, gama, sistemaOperativo, instalacion);
                        case "Smartphone" -> new Smartphone(autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, 
                                pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
                        case "Smartwatch" -> new Smartwatch(autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, 
                                pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
                        case "Tablet" -> new Tablet(autonomia, peso, dimensiones, color, apruebaDeAguaPolvo, 
                                pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
                        case "Television" -> new Television(pantalla, ram, almacenamiento, nombre, marca, procesador, 
                                gama, sistemaOperativo, instalacion);
                        default -> {
                            System.out.println("Tipo de producto desconocido para: " + nombre);
                            yield null; // Retorna null si no se encuentra un tipo válido
                        }
                    };
                    
                    

                    if (nuevoProducto != null) {
                        // Agrega el nuevo producto al inventario
                        inventario.agregarProducto(nuevoProducto);
                        System.out.println("Producto agregado: " + nombre);
                    } else {
                        System.out.println("Tipo de producto desconocido para: " + nombre);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        } catch (URISyntaxException e) {
            System.out.println("Error al determinar la ruta del archivo: " + e.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
        almacenarProductos();
    }


}
