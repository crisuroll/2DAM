package stringChar;

import java.util.Scanner;

/**
 * Clase Ej03. Escribe un programa que cuente cuantas vocales (solo en minuscula) hay en una 
 * cadena de texto ingresada por el usuario.
 * @author crisuroll
 */

public class Ej03 {
	
	/**
	 * Metodo main
	 * @param args
	 */

	public static void main(String[] args) {
		
		String st = "";
		int i = 0;
		int v = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa una cadena de texto: ");
		st = sc.nextLine();	
		sc.close();
		for (i = 0; i < st.length(); i++) {
			if ((st.charAt(i) == 'a') || (st.charAt(i) == 'b') || (st.charAt(i) == 'c') 
				|| (st.charAt(i) == 'd') || (st.charAt(i) == 'e')) {
				v++;
			}
		}
		
		System.out.println("La cadena introducida tiene " + v + " vocales minúsculas.");

	}

}
