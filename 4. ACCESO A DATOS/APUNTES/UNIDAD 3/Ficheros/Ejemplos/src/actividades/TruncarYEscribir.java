package actividades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Tarea: ¿Qué hace el ejemplo de la clase TruncarYEscribir? ¿Qué ocurre si lo ejecutas varias veces?
 * 
 * 
 * Para finalizar, busca información sobre los métodos de la clase Files. Mira algunos de los que
 * hemos utilizado o investiga acerca de otros. Fíjate bien en la descripción de cada método, los
 * parámetros que reciben y el tipo de retorno que tienen.
 */
public class TruncarYEscribir {
    public static void main(String[] args) {
        Path ruta = Paths.get("archivoTruncado.txt");
        String contenido = "Este es el nuevo contenido que reemplaza el anterior.\n";
        
        try {
            if (Files.notExists(ruta)) {
                Files.writeString(ruta, "Este es el contenido inicial del archivo.", StandardOpenOption.CREATE);
                System.out.println("Archivo creado con contenido inicial.");
            }
            
            Files.writeString(ruta, contenido, /*StandardOpenOption.WRITE,*/ StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Contenido escrito y archivo truncado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
