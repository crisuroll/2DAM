
class Externa {
	void metodoExterno() {
		class Local {
			void mostrarMensaje() {
				System.out.println("Hola desde la clase local!");
			}
		}
		Local local = new Local();
		local.mostrarMensaje();
	}
}
