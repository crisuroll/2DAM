
class Externa {
	private String mensaje = "Hola desde la clase externa!";

	class Interna {
		void mostrarMensaje() {
			System.out.println(mensaje); // Puede acceder a elementos privados
		}
	}
}
