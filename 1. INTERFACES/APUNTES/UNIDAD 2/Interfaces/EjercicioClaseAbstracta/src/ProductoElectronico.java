
abstract public class ProductoElectronico {
	protected String nombre;
	protected float precio;
	
	ProductoElectronico(String _nombre, float _precio) {
		this.nombre = _nombre;
		this.precio = _precio;
	}
	
	abstract public String mostrarInformacion();
}
