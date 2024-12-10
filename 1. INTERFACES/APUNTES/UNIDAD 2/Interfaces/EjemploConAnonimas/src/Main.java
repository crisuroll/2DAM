
public class Main {

	public static void main(String[] args) {
		IFormas figura = new IFormas() {
			@Override
			public void dibujarForma(String figura) {
				System.out.println("Metodo dibujarForma() del " + figura + " ejecutado.");
			}
			
			@Override
			public void mostrarPropiedades(String figura) {
				System.out.println("Metodo mostrarPropiedades() del " + figura + " ejecutado.");
			}
		};
		figura.dibujarForma("Cuadrado");
		figura.dibujarForma("Rectángulo");
		figura.dibujarForma("Triángulo");

	}

}
