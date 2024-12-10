
public class Laptop extends ProductoElectronico {
	private String marca;
	
	public Laptop(String _nombre, float _precio, String _marca) {
		super(_nombre, _precio);
		this.marca = _marca;
		//return nombre, modelo, precio;
	}
	public String mostrarInformacion() {
		String info = nombre + ", " + marca + ", " + precio;
		return info;
	}
}
