import java.util.Scanner;

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
