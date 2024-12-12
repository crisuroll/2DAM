package uuu;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String fichero = "uwu.txt";
		String s = "POR QUE TANTOS FALLOS JODER\n";
		Path p = Path.of(fichero);
		String line = "";
		
		try (FileOutputStream fos = new FileOutputStream(fichero);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			bos.write(s.getBytes());
			bos.close();			
			List<String> lineas = Files.readAllLines(p);
			for (String linea : lineas) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			
		}

	}

}
