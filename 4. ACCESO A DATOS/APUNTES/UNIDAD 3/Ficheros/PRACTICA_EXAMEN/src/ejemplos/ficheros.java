package ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ficheros {

	public static void main(String[] args) {
		File archivo = new File("ficheritos.txt");
		try {
			if(archivo.createNewFile()) {
				System.out.println("Archivo creado.");
			} else {
				System.out.println("Archivo ya existente.");
			}
			
			try (FileWriter escritor = new FileWriter(archivo)) {
				escritor.write("Estoy escribiendo");
			}
				FileReader lector = new FileReader(archivo);
			BufferedReader buff = new BufferedReader(lector);
			
			String linea;
			System.out.println("Contenido del archivo: ");
			while((linea = buff.readLine()) != null) {
				System.out.println(linea);
			}
			
			buff.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}