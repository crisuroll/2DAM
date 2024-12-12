package ej1;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileTooLargeException, InvalidLineFormatException, FileNotFoundException {
		
		Path p = Path.of("ejercicio1.txt");
		if(!Files.exists(p)) {
			throw new FileNotFoundException();
		} else {
			try(Scanner sc = new Scanner(p)) {
				while (sc.hasNextLine()) {
					String line = sc.nextLine();
					int cont = 1;
					try {
						line.matches("^[a-zA-Z0-9\\s]+$");
					} catch(InvalidLineFormatException e) {
						e.getMessage();
					}
					cont++;
				}
			} catch (IOException e) {
				e.getStackTrace();
			}
		}
		

	}

}