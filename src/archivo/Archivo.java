package archivo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archivo{

       public static void almacenarProductos() {
        try {
            Path packageActual = Paths.get(Archivo.class.getResource("Archivo.class").toURI()).getParent();
            Path directorio = packageActual.resolve("archivo");
            Path ruta = directorio.resolve("Productos.txt");

            if (Files.exists(ruta)) {
                try (BufferedReader lector = new BufferedReader(new FileReader(ruta.toFile()))) {
                    String linea;
                    while ((linea = lector.readLine()) != null) {
                        String[] bloques = linea.split("\t"); // separa cada elemento que esté tabulado
                        System.out.println(linea.split("\t").toString());

                    }
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo: " + e.getMessage());
                }
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (URISyntaxException e) {
            System.out.println("Error al determinar la ruta del archivo: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        almacenarProductos();
    }


}
