package ej1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Inventario inventario = new Inventario();
		Scanner sc = new Scanner(System.in);
		int op = 0;
		
		/*System.out.println("1. Agregar producto\n2. Retirar producto\n3. Consultar producto\n4. Mostrar Inventario\n5. Salir");
		System.out.println("\nElige una opción: ");
		op = sc.nextInt();
		
		while (op != 5) {
			switch(op) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5: 
				break;
			}

		}*/
		
		inventario.agregarProducto(new Producto("001", "Laptop", 10, 1500.0));
		inventario.agregarProducto(new Producto("002", "Teclado", 50, 25.0));
		inventario.agregarProducto(new Producto("003", "Mouse", 30, 15.0));
		inventario.agregarProducto(new Producto("001", "Monitor", 5, 300.0));
		
		inventario.consultarProducto("001");
		
		inventario.retirarProducto("001", 5);
		inventario.retirarProducto("001", 400);
		
		inventario.consultarProducto("001");
		inventario.mostrarInventario();

	}

}