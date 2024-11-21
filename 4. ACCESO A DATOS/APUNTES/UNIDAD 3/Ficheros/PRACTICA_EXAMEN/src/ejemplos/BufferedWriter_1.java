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

public class BufferedWriter_1 {

	public static void main(String[] args) {
		String nombre = "archivo.txt";
		String contenido = "Hasjhfajskfh";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
			bw.write(contenido);
		} catch (IOException e) {
			
		}

	}

}
