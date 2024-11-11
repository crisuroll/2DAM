package actividades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Tarea: ¿Qué hace el ejemplo de la clase CrearNuevoConCreateNew? ¿Qué pasará al ejecutarlo dos veces? 
 * Busca más información sobre la palabra reservada intanceof (línea 19). Además, fíjate en que aquí 
 * controlamos la excepción a la que hacíamos mención hace algunas diapositivas en el 
 * punto Manejo de excepciones.
 */
public class CrearNuevoConCreateNew {
    public static void main(String[] args) {
        Path ruta = Paths.get("nuevoArchivoCreateNew.txt");
        String contenido = "Este archivo se creó usando CREATE_NEW.\n";
        
        try {
            Files.writeString(ruta, contenido, StandardOpenOption.CREATE_NEW);
            System.out.println("Archivo creado y contenido escrito.");
        } catch (IOException e) {
            if (e instanceof java.nio.file.FileAlreadyExistsException) {
                System.out.println("El archivo ya existe y no se ha sobrescrito.");
            } else {
                e.printStackTrace();
            }
        }
    }
}
