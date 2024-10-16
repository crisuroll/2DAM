import java.util.Scanner;

/**
 * Crea un pequeño proyecto que maneje una matriz 4x4 de enteros int[][]. Debes pedir al
 * usuario que inserte un nuevo valor en la columna i-ésima y fila j-ésima (es decir,
 * también debes pedirle la posición donde desea insertar el nuevo valor). Hecho esto, el
 * programa actualizará el valor de la matriz en dicha posición. Si se introduce una
 * posición fuera de límites, entonces se creará una excepción con un mensaje
 * personalizado que deberás capturar y mostrar por pantalla. De cualquier otro modo, se
 * mostrar un mensaje Posición actualizada y se cerrará el scanner. Por último, debes
 * imprimir nuevamente la matriz.
 */

public class MatrizEnteros {

	public static void main(String[] args) {
		int i;
		int j;
		int num;
		int[][] matriz = new int[4][4];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el valor: ");
		num = sc.nextInt();
		System.out.println("Dime la fila: ");
		i = sc.nextInt();
		System.out.println("Dime la columna: ");
		j = sc.nextInt();
		
		try {
			matriz[i][j] = num;
			System.out.println("Posición actualizada.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posición fuera de límites: " + e.getMessage());
		} finally {
			for (i = 0; i < matriz.length; i++) {
	            for (j = 0; j < matriz[i].length; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
			sc.close();
		}

	}

}
