package archivo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import inventario.Inventario;

public class Archivo{

    public static void almacenarProductos(Inventario inventario) {
        try {
            Path packageActual = Paths.get(Archivo.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
            Path directorio = packageActual.resolve("archivo");
            Path ruta = directorio.resolve("Productos.txt");
            System.out.println("Ruta calculada del archivo: " + ruta.toString());
    
            if (!Files.exists(directorio)) {
                try {
                    Files.createDirectories(directorio);
                    System.out.println("Directorio creado: " + directorio.toString());
                } catch (IOException e) {
                    System.out.println("Error al crear el directorio: " + e.getMessage());
                    return;
                }
            }
    
            // Verifica si el archivo existe, y si no, créalo
            if (!Files.exists(ruta)) {
                try {
                    Files.createFile(ruta);
                    System.out.println("Archivo creado: " + ruta.toString());
                } catch (IOException e) {
                    System.out.println("Error al crear el archivo: " + e.getMessage());
                    return; 
                }
            }
    
            // Lee el archivo si ya existe
            try (BufferedReader lector = new BufferedReader(new FileReader(ruta.toFile()))) {
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String[] bloques = linea.split("\t"); // separa cada elemento que esté tabulado
                    
                    System.out.println(java.util.Arrays.toString(bloques));
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
