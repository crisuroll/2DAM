import java.awt.RenderingHints.Key;
import java.util.HashMap;

public class ShoppingCart {
	private HashMap<String, Integer> cart;
	private HashMap<String, Double> prices;
	
	public ShoppingCart() {
		this.cart = new HashMap<>();
		this.prices = new HashMap<>();
		
		this.prices.put("manzana", 0.50);
		this.prices.put("platano", 0.30);
		this.prices.put("naranja", 0.60);
		this.prices.put("leche", 2.50);
		this.prices.put("pan", 1.50);
	}
	
	public void addProduct(String product, Integer cant) {
		if(!this.prices.containsKey(product)) {
			System.out.println("Producto no disponible en la tienda.");
		} else {
			this.cart.put(product, cant);
			System.out.println("Agregado " + cant + " " + product + "(s) al carrito");
		}
	}
	
	public void eliminarProduct(String product) {
		if(!this.cart.containsKey(product)) {
			System.out.println("Producto no existente en el carrito.");
		} else {
			this.cart.remove(product);
			System.out.println("Eliminado " + product + " del carrito");
		}
	}
	
	public void updateCantidad(String product, Integer cant) {
		if(!this.cart.containsKey(product)) {
			System.out.println("Producto no encontrado en el carrito");
		} else if (cant <= 0) {
			this.cart.remove(product);
			System.out.println("Eliminado " + product + " del carrito");
		} else {
			this.cart.put(product, cant);
			System.out.println("Actualizado " + product + " cantidad a " + cant);
		}
	}
	
	public void mostrarCarrito() {
		/*System.out.println("Contenido del carrito:");
		System.out.println("----------------------");
		this.cart.forEach((key, value) -> System.out.println(key + " - Cantidad: " + value  + " - Precio: $" + this.prices.get(key)*value));
		cantidadTotal();*/
		double total = 0.00;
		for (String name : this.cart.keySet()) {
			System.out.println(this.cart.get(name) + " " + name + " " + cantidadTotal(name));
			total += cantidadTotal(name);
		}
		System.out.println("Total: $" + total);
	}
	
	public double cantidadTotal(String name) {
		/*Double precio;
		System.out.print("Total: $");
		this.cart.forEach((key, value) -> System.out.println(this.prices.get(key)*this.cart.get(key)));*/
		double total = this.cart.get(name) * this.prices.get(name);
		if (total > 20) {
			return total - ((10*total)/100);
		} else {
			return total;
		}
	}
}
