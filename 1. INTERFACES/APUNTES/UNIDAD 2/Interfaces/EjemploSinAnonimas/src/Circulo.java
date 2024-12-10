
public class Circulo implements IFormas {
	@Override
	public void dibujarForma(String figura) {
		System.out.println("Metodo dibujarForma() del " + figura + " ejecutado.");
	}
	
	@Override
	public void mostrarPropiedades(String figura) {
		System.out.println("Metodo mostrarPropiedades() del " + figura + " ejecutado.");
	}
}
