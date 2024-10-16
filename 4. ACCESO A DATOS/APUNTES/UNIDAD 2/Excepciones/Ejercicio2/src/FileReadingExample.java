import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

// COMENTA LÍNEA A LÍNEA LO QUE HACE EL SIGUIENTE CÓDIGO

public class FileReadingExample {
	public static void main(String[] args) {
		BufferedReader reader = null;
		/*
		 * Crea un reader, con valor null de momento.
		 * Pide al usuario que introduzca un nombre al fichero y crea un objeto InputStream. Con ello crea
		 * un String que contenga el nombre del fichero introducido por el usuario.
		 * En reader crea un nuevo FileReader. Después crea un String line.
		 * Mientras la línea leída en inputReader y no sea null, la guarda en line y la imprime.
		 */
		try {
			System.out.print("Enter the file name: ");
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
			String fileName = inputReader.readLine();
			reader = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		/*
		 * La primera excepción es que no exista ningún fichero.
		 */
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		/*
		 * La segunda excepción es que ha habido un error con la entrada o salida.
		 */
		} catch (IOException e) {
			System.out.println("An I/O error occurred: " + e.getMessage());
		/*
		 * Se cierra el reader si todo va bien y no es nulo. Si ha saltado un error de entrada/salida
		 * al intentar cerrar el fichero, se imprime un mensaje de error.
		 */
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing the file: " + e.getMessage());
			}
		}
	}
}