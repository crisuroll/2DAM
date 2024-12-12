package ej4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nomFich = "ej4.txt";
		File fichero = new File(nomFich);
		Path p = Path.of(nomFich);
		int op = 0;
		String command = "";
		
		System.out.println("=== Historial de Comandos ===\n");
		while (op != 3) {
			System.out.println("¿Qué deseas hacer?\n1. Escribir un nuevo comando\n2. Leer el historial de comandos\n3. Salir\n");
			System.out.println("Opción: ");
			op = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
			case 1:
				try {
					if(!Files.exists(p)) {
						fichero.createNewFile();
					}
					try {
						//BufferedWriter bw = Files.newBufferedWriter(p, StandardOpenOption.APPEND);
						System.out.println("Escribe un comando: ");
						command = sc.nextLine();
						command = command + "\n";
						Files.write(p, command.getBytes(), StandardOpenOption.APPEND);
						System.out.println("Comando guardado en el historial.");
					} catch (IOException e) {
						
					}
					

					
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 2:
				try {
					if (!Files.exists(p)) {
						System.out.println("No hay comandos en el historial.");
					} else {
						System.out.println("=== Historial de Comandos ===\n");
						List<String> lineas = Files.readAllLines(p);
						for (String linea:lineas) {
							System.out.println(linea);
						}
					}
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Saliendo del programa. Bye!");
				break;
			}
		}
	}
}