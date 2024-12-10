
public class Main {
	public static void main(String[] args) {
		Saludo saludo = new Saludo() {
			public void saludar() {
				System.out.println("Hola desde la clase anónima!");
			}
		};
		saludo.saludar();
	}
}
