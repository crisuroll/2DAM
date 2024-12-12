
public class BST {

	private Node root;
	
	/* BUSCAR NODO
	 * 
	 */
	public boolean containsNode(int value) {
		return containsNodeR(this.root, value);
	}
	
	public boolean containsNodeR(Node current, int value) {
		
		if (current == null) {
			return false;
		}
		
		if (current.value == value) {
			return true;
		}
		
		return value < current.value ? containsNodeR(current.left, value) : containsNodeR(current.right, value);
		
	}
	
	/*
	 * AÑADIR NODO
	 */
	public void add(int value) {
		this.root = addR(this.root, value);
	}
	
	public Node addR(Node current, int value) {
		
		if (current == null) {
			return new Node(value);
		}
		
		if (value < current.value) {
			current.left = addR(current.left, value);
		} else if (value > current.value) {
			current.right= addR(current.right, value);
		} else {
			return current;
		}
		
		return current;
		
	}
	
	public void preOrden() {
		preOrdenR(this.root);
	}
	
	public void preOrdenR(Node current) {
		System.out.println(current.value);
		preOrdenR(current.left);
		preOrdenR(current.right);
	}
	
}
