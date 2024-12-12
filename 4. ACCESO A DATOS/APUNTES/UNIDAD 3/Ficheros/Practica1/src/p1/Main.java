package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		System.out.println("Edad: ");
		edad = sc.nextInt();
		
		try {
			if (edad > 0 || edad < 100) {
				System.out.println("Edad valida");
			} else {
				throw new EdadInvalidaException("Edad no valida");
			}
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
		}

	}

}
