package p2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String fichero = "usuarios.txt";
		String linea = "";
		Path p = Path.of(fichero);
		try {
			while (sc.hasNextLine()) {
				Files.write(p, linea.getBytes(), StandardOpenOption.APPEND);				
			}	
		} catch (IOException e) {
			
		} catch (NullPointerException e) {
			
		}

	}

}
