package ejemplos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EjercicioPath {

	public static void main(String[] args) {
		String archivo = "path.txt";
		Path path = Path.of(archivo);
		
		try {
			if(Files.notExists(path)) {
				Files.createFile(path);
				System.out.println("Archivo creado " + path.getFileName());
			} else {
				System.out.println("Ya existe.");
			}
			String contenido = "Hola 1 \n" + "Hola 2 \n" + "Hola 3 \n" + "Hola 4 \n";
			Files.writeString(path, contenido, StandardOpenOption.APPEND);
			
			List<String> lines = Files.readAllLines(path);
			
			for (String line : lines) {
				System.out.println(line);
			}
			
			
			
		} catch (IOException e) {
			
		}


	}

}