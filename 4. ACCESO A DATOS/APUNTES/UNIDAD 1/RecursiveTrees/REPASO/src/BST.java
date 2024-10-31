
public class BST {

	private Node root;
	
	/*
	 * BUSCAR NODO
	 */
	public boolean searchNode(int _value) {
		return searchNodeR(this.root, _value);
	}
	
	public boolean searchNodeR(Node _current, int _value) {
		if (_current == null) {
			return false;
		}
		
		if (_value == _current.value) {
			return true;
		}
		
		return _value < _current.value ? searchNodeR(_current.left, _value) 
				: searchNodeR(_current.right, _value);
	}
	
	/*
	 * AÑADIR NODO
	 */
	public void addNode(int _value) {
		this.root = addNodeR(this.root, _value);
	}
	
	public Node addNodeR(Node _current, int _value) {
		if (_current == null) {
			return new Node(_value);
		}
		
		if (_value < _current.value) {
			_current.left = addNodeR(_current.left, _value);
		} else if (_value > _current.value) {
			_current.right = addNodeR(_current.right, _value);
		} else {
			return _current;
		}
		
		return _current;
		
	}
	
	/*
	 * PREORDEN
	 */
	public void preorden() {
		preordenR(this.root);
	}
	
	public void preordenR(Node _current) {
		if (_current != null) {
			System.out.println(_current.value + " ");
			preordenR(_current.left);
			preordenR(_current.right);	
		}
	}
	
	/*
	 * INORDEN
	 */
	public void inorden() {
		inordenR(this.root);
	}
	
	public void inordenR(Node _current) {
		if (_current != null) {
			inordenR(_current.left);
			System.out.println(_current.value + " ");
			inordenR(_current.right);
		}
	}
	
	/*
	 * POSTORDEN
	 */
	public void postorden() {
		postordenR(this.root);
	}
	
	public void postordenR(Node _current) {
		if (_current != null) {
			postordenR(_current.left);
			postordenR(_current.right);
			System.out.println(_current.value + " ");
		}
	}
	
	/*
	 * ESTRICTO
	 */
	public boolean isStrict() {
		return isStrictR(this.root);
	}
	
	public boolean isStrictR(Node _current) {
		if (_current == null) {
			return true;
		}
		
		if ((_current.left != null && _current.right == null) || (_current.left == null && _current.right != null)) {
			return false;
		}
		
		return isStrictR(_current.left) && isStrictR(_current.right);
	}
	
	/*
	 * CONTAR NODOS
	 */
	public int  contar() {
		return contarR(this.root);
	}
	
	public int contarR(Node _current) {
		if (_current == null) {
			return 0;
		}
		
		return 1 + contarR(_current.left) + contarR(_current.right);
	}
	
	/*
	 * SUMA NODOS
	 */
	public int suma() {
		return sumaR(this.root);
	}
	
	public int sumaR(Node _current) {
		int sum = 0;
		if (_current == null) {
			return 0;
		}
		
		sum += _current.value;
		return sum + sumaR(_current.left) + sumaR(_current.right);
	}
	
	/*
	 * SUMA PAR
	 */
	public int sumaPar() {
		return sumaParR(this.root);
	}
	
	public int sumaParR(Node _current) {
		int sum;
		if (_current == null) {
			return 0;
		}
		
		if (_current.value % 2 == 0) {
			sum = _current.value;	
		} else {
			sum = 0;
		}
		
		return sum + sumaParR(_current.left) + sumaParR(_current.right);
	}
	
	/*
	 * ALTURA
	 */
	public int altura() {
		return alturaR(this.root);
	}
	
	public int alturaR(Node _current) { 
		if (_current == null) {
			return 0;
		}
		
		return 1 + Math.max(alturaR(_current.left), alturaR(_current.right));
	}
	
	
}
