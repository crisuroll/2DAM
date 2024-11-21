package ejemplos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class BufferedWriter_2 {

	public static void main(String[] args) {
	    Path path = Path.of("miejemplo.txt");
	    System.out.println("Carpeta de trabajo actual: " + System.getProperty("user.dir"));
	    if (!Files.exists(path)) {
	        try {
	            path = Files.createFile(path);
	            System.out.println("Archivo creado: " + path.toAbsolutePath());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    } else {
	        System.out.println("El archivo ya existe en: " + path.toAbsolutePath());
	    }

	    String contenido = "jksdgjksahdgl";
	    try (BufferedWriter bw = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
	        bw.write(contenido);
	        System.out.println("Contenido escrito al archivo.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}


}
