package ej3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===Configuración de la Cuenta 1===");
		System.out.println("Ingrese el nombre del titular: ");
		String nom1 = sc.next();
		System.out.println("Ingrese el número de cuenta: ");
		int num1 = sc.nextInt();
		System.out.println("Ingrese el saldo inicial: ");
		int saldo1 = sc.nextInt();
		
		System.out.println("===Configuración de la Cuenta 2===");
		System.out.println("Ingrese el nombre del titular: ");
		String nom2 = sc.next();
		System.out.println("Ingrese el número de cuenta: ");
		int num2 = sc.nextInt();
		System.out.println("Ingrese el saldo inicial: ");
		int saldo2 = sc.nextInt();
		
		System.out.println("Saldo inicial de la cuenta de " + nom1 + ": " + saldo1);
		System.out.println("Saldo inicial de la cuenta de " + nom2 + ": " + saldo2);
		
		int op = 4;
		while (op != 0) {
			System.out.println("===Menú de transferencias===");
			System.out.println("1: Transferir de la cuenta de " + nom1 + " a la cuenta de " + nom2);
			System.out.println("2: Transferir de la cuenta de " + nom2 + " a la cuenta de " + nom1);
			System.out.println("0: Salir");
			System.out.println("Seleccione una opción: ");
			op = sc.nextInt();
			System.out.println("Seleccione el importe a transferir: ");
			float importe = sc.nextInt();
			
			switch (op) {
			case 1:
				try {
					
				} catch (FondosInsuficientesException e) {
					System.out.println("Transfiriendo " + importe + " euros de la cuenta de " + nom1 + " a la cuenta de " + nom2);
				} finally {
					System.out.println("Saldo de la cuenta de " + nom1 + " después de la transferencia: " + saldo1);
					System.out.println("Saldo de la cuenta de " + nom2 + " después de la transferencia: " + saldo2);
				}
			case 2:
				System.out.println("Transfiriendo " + importe + " euros de la cuenta de " + nom2 + " a la cuenta de " + nom1);
				System.out.println("Saldo de la cuenta de " + nom2 + " después de la transferencia: " + saldo2);
				System.out.println("Saldo de la cuenta de " + nom1 + " después de la transferencia: " + saldo1);
			case 0:
			}
		}


	}

}