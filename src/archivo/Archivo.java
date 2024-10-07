package archivo;
import dispositivos.DispositivoElectronico;
import inventario.Inventario;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import productos.*;

public class Archivo{
    public static void almacenarProductos(Inventario inventario) {
        Path directorio = Paths.get("archivo");
        Path ruta = directorio.resolve("Productos.txt");

        // Crear el directorio y el archivo si no existen
        try {
            // Crear el directorio si no existe
            if (!Files.exists(directorio)) {
                Files.createDirectories(directorio);
                System.out.println("Directorio creado: " + directorio);
            }

            // Crear el archivo si no existe
            if (!Files.exists(ruta)) {
                Files.createFile(ruta);
                System.out.println("Archivo creado: " + ruta);
            }
        } catch (IOException e) {
            System.out.println("Error al crear directorio o archivo: " + e.getMessage());
            return;
        }

        // Leer el archivo
        try (BufferedReader lector = Files.newBufferedReader(ruta)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                procesarLinea(linea, inventario);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static void procesarLinea(String linea, Inventario inventario) {
        String[] bloques = linea.split("\t");

        if (bloques.length < 17) {
            System.out.println("Datos insuficientes en la línea: " + linea);
            return;
        }

        try {
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

            DispositivoElectronico nuevoProducto = crearProducto(nombre, precio, autonomia, peso, dimensiones, color,
                    apruebaDeAguaPolvo, pantalla, ram, almacenamiento, marca, procesador, gama, sistemaOperativo, instalacion);
            
            if (nuevoProducto != null) {
                inventario.agregarProducto(nuevoProducto);
                System.out.println("Producto agregado: " + nombre);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir datos en la línea: " + linea + ". " + e.getMessage());
        }
    }

    private static DispositivoElectronico crearProducto(String nombre, float precio, int autonomia, float peso,
            String dimensiones, String color, boolean apruebaDeAguaPolvo, int pantalla, int ram,
            int almacenamiento, String marca, String procesador, String gama, String sistemaOperativo, String instalacion) {
        
        return switch (nombre) {
            case "CámaraDigital" -> new CamaraDigital((int) precio, autonomia, (int) peso, dimensiones, color, apruebaDeAguaPolvo, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
            case "Computadora" -> new Computadora((int) precio, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo, instalacion);
            case "Consola" -> new Consola((int) precio, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo, instalacion);
            case "ConsolaPortable" -> new ConsolaPortable((int) precio, autonomia, (int) peso, dimensiones, color, apruebaDeAguaPolvo, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
            case "Impresora" -> new Impresora((int) precio, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo, instalacion);
            case "Laptop" -> new Laptop((int) precio, autonomia, (int) peso, dimensiones, color, apruebaDeAguaPolvo, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
            case "ReproductorVideo" -> new ReproductorVideo((int) precio, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo, instalacion);
            case "SistemaAudio" -> new SistemaAudio((int) precio, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo, instalacion);
            case "Smartphone" -> new Smartphone((int) precio, autonomia, (int) peso, dimensiones, color, apruebaDeAguaPolvo, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
            case "Smartwatch" -> new Smartwatch((int) precio, autonomia, (int) peso, dimensiones, color, apruebaDeAguaPolvo, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
            case "Tablet" -> new Tablet((int) precio, autonomia, (int) peso, dimensiones, color, apruebaDeAguaPolvo, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo);
            case "Television" -> new Television((int) precio, pantalla, ram, almacenamiento, nombre, marca, procesador, gama, sistemaOperativo, instalacion);
            default -> {
                System.out.println("Tipo de producto desconocido para: " + nombre);
                yield null;
            }
        };
    }
    
    
    public static void main(String[] args)throws IOException {
        Inventario inventario = new Inventario();
        almacenarProductos(inventario);
        System.out.println("Ya se ejecutó");
        inventario.getProductos().forEach((id, producto )-> System.out.println(id + " - " + producto.getNombre()));
    }


}
