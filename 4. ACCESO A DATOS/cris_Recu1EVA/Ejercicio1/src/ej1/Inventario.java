package ej1;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
	private Map<String, Producto> productos;
	
	public Inventario() {
		this.productos = new HashMap<String, Producto>();
	}
	
	public void agregarProducto(Producto producto) {
		try {
			if (this.productos.containsKey(producto.getId())) {
				throw new ProductoDuplicadoException("Error: El producto con ID " + producto.getId() + " ya existe en el inventario.");
			} else {
				this.productos.put(producto.getId(), producto);
				System.out.println("Producto agregado: " + producto.toString());
			}
		} catch (ProductoDuplicadoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void retirarProducto(String id, int cantidad) {
		try {
			if (this.productos.get(id).getCantidad() < cantidad) {
				throw new CantidadInsuficienteException("Error: Cantidad insuficiente del producto: " + this.productos.get(id).getNombre());
			} else {
				int nC = this.productos.get(id).getCantidad() - cantidad;
				this.productos.get(id).setCantidad(nC);
				System.out.println("Producto retirado: " + this.productos.get(id).getNombre() + ", Cantidad retirada: " + this.productos.get(id).getCantidad());
			}
		} catch (CantidadInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void consultarProducto(String id) {
		System.out.println(this.productos.get(id).toString());
	}
	
	public void mostrarInventario() {
		for (String producto : this.productos.keySet()) {
			System.out.println(this.productos.get(producto).toString());
		}
	}
}