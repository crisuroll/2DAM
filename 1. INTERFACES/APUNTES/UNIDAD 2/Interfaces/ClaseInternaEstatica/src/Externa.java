
class Externa {
	static String mensaje = "Hola desde la clase externa!";

	static class InternaEstatica {
		void mostrarMensaje() {
			System.out.println(mensaje); // Puede acceder a elementos estáticos
		}
	}
}