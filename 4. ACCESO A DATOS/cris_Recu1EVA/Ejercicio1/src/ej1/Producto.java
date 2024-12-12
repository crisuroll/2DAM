package ej1;

public class Producto {
	private String id;
	private String nombre;
	private int cantidad;
	private double precio;
	
	public Producto(String id, String nombre, int cantidad, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString() {
		String p = "ID: " + id + ", Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio: " + precio + " euros";
		return p;
	}
}