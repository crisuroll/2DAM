package actividades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Tarea: ¿Qué hace el ejemplo de la clase ArchivoTemporal? Busca más información sobre el método 
 * createTempFile() de la clase Files.
 */
public class ArchivoTemporal {
    public static void main(String[] args) {
        try {
            Path ruta = Files.createTempFile("tempFile", ".txt");
            Files.writeString(ruta, "Este es un archivo temporal.\n", 
                    StandardOpenOption.DELETE_ON_CLOSE);
            System.out.println("Archivo temporal creado y contenido escrito. Se eliminará al cerrar.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
