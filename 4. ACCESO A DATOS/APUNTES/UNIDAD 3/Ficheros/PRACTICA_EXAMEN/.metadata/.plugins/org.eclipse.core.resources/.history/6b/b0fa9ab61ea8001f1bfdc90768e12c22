package ejemplos;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjercicioBufferedOutputStream {

	public static void main(String[] args) {
		String nombre = "archivo.txt";
		String contenido = "Holiiiiii";
		
		try(FileOutputStream fos = new FileOutputStream(nombre);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			bos.write(contenido.getBytes());
			
		} catch (IOException e) {
			
		}

	}

}
