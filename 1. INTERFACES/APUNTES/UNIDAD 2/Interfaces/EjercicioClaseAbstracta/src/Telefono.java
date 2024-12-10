
public class Telefono extends ProductoElectronico {
	private String modelo;
	
	public Telefono(String _nombre, float _precio, String _modelo) {
		super(_nombre, _precio);
		this.modelo = _modelo;
		//return nombre, modelo, precio;
	}
	public String mostrarInformacion() {
		String info = nombre + ", " + modelo + ", " + precio;
		return info;
	}
}
