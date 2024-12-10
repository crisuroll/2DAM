
/**
* Dibuja el diagrama UML antes de codificar. El ejercicio consiste en crear una clase abstracta llamada 
ProductoElectronico con los atributos: nombre y precio, y el método abstracto mostrarInformacion().
Crea dos clases concretas que extiendan de ProductoElectronico:
Telefono: debe tener un atributo adicional llamado modelo y debe implementar el método abstracto para que 
muestre el nombre, modelo y precio del teléfono.
Laptop: debe tener un atributo adicional llamado marca y debe implementar el método abstracto para que 
muestre el nombre, marca y precio del laptop.
En la clase principal Main, crea instancias de Telefono y Laptop, llamando al método mostrarInformacion() para cada 
instancia. Analiza los resultados obtenidos.

*/

public class Main {

	public static void main(String[] args) {
		
		Telefono A = new Telefono("iPhone", 900f, "15");
		Laptop B = new Laptop("HP", 500f, "255G");
		
		System.out.println(A.mostrarInformacion());
		System.out.println(B.mostrarInformacion());
	}

}
