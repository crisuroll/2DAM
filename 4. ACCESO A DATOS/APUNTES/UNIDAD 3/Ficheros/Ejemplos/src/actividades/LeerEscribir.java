package actividades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Tarea: ¿Qué hace el ejemplo de la clase LeerEscribir? Fíjate en que debemos asegurarnos de que el
 * archivo existe y, que si no es así, entonces lo creemos. Al mismo tiempo, fíjate en que, en realidad,
 * READ y WRITE están implícitamente actuando en los métodos readString() y writeString() respectivamente, 
 * por eso están comentados en las líneas 22 y 26, porque en realidad no hace falta.
 * En otras palabras; no es necesario indicar un StandardOpenOption.READ cuando utilizamos el
 * readString(), y lo mismo para cuando queremos escribir.
 */
public class LeerEscribir {
    public static void main(String[] args) {
        Path ruta = Paths.get("archivoLeerEscribir.txt");
        String nuevoContenido = "\nEste es un nuevo contenido añadido al archivo.\n";
        
        try {
            if (Files.notExists(ruta)) {
                Files.writeString(ruta, "Este es el contenido inicial del archivo.", StandardOpenOption.CREATE);
                System.out.println("Archivo creado con contenido inicial.");
            }

            String contenidoExistente = Files.readString(ruta /*, StandardOpenOption.READ*/);
            System.out.println("Contenido existente:\n" + contenidoExistente);
            
            Files.writeString(ruta, nuevoContenido, /*StandardOpenOption.WRITE,*/ StandardOpenOption.APPEND);
            System.out.println("Nuevo contenido añadido.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
