
public class BST {

	// Atributos
	private Node root;

	// Métodos

	/*
	 * BUSCAR NODO
	 */

	public boolean containsNode(int _value) {
		return containsNodeRecursive(this.root, _value);
	}

	public boolean containsNodeRecursive(Node _current, int _value) {
		if (_current == null) {
			return false;
		}

		if (_value == _current.value) {
			return true;
		}

		return _value < _current.value ? containsNodeRecursive(_current.left, _value)
				: containsNodeRecursive(_current.right, _value);

	}

	/*
	 * AÑADIR NODO
	 */

	public void addNode(int _value) {
		this.root = addNodeRecursive(this.root, _value);
	}

	public Node addNodeRecursive(Node _current, int _value) {
		// Si el nodo no está creado, se crea. CASO BASE
		if (_current == null) {
			return new Node(_value);
		}

		// Si el valor es menor que el del nodo actual
		if (_value < _current.value) {
			_current.left = addNodeRecursive(_current.left, _value);
		} else if (_value > _current.value) {
			_current.right = addNodeRecursive(_current.right, _value);
		} else {
			return _current;
		}

		return _current;
	}

	/*
	 * ORDENAR ÁRBOL
	 */

	// pre-orden
	public void preOrden() {
		preOrdenRecursive(this.root);
	}

	public void preOrdenRecursive(Node _current) {
		if(_current != null) {
			System.out.print(_current.value + " ");
			preOrdenRecursive(_current.left);
			preOrdenRecursive(_current.right);
		}
	}

	// post-orden
	
	public void postOrden() {
		postOrdenRecursive(this.root);
	}
	
	public void postOrdenRecursive(Node _current) {
		if(_current != null) {
			postOrdenRecursive(_current.left);
			postOrdenRecursive(_current.right);
			System.out.print(_current.value  + " ");
		}
	}
	
	// in-orden
	
	public void inOrden() {
		inOrdenRecursive(this.root);
	}
	
	public void inOrdenRecursive(Node _current) {
		if(_current != null) {
			inOrdenRecursive(_current.left);
			System.out.print(_current.value + " ");
			inOrdenRecursive(_current.right);
		}
	}

	/*
	 * ELIMINAR NODO
	 */

	public void delete(int value) {
		root = deleteRecursive(root, value);
	}

	private Node deleteRecursive(Node current, int value) {
		// If the current node is null, just in case
		if (current == null) {
			return null;
		}

		// In this if sentence, the value of the node to delete was found
		if (value == current.value) {

			// Case 1: The node is a leaf node
			if (current.left == null && current.right == null) {
				return null;
			}

			// Case 2: The node has one child
			if (current.right == null) {
				return current.left;
			}

			if (current.left == null) {
				return current.right;
			}

			// Case 3: The node has two children
			int smallestValue = findSmallestValue(current.right);
			System.out.println(smallestValue);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
		}

		// In this if sentence, the value is less than the value of the current node
		if (value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current;
		} else {
			// In this if sentence, the value is bigger than the value of the current node
			current.right = deleteRecursive(current.right, value);
			return current;
		}
		
	}

	// We’ll use the smallest node of the soon to be deleted node’s right sub-tree
	private int findSmallestValue(Node root) {
		return root.left == null ? root.value : findSmallestValue(root.left);
	}
	
	/*
	 * ES ESTRICTO
	 */
	public boolean isStrict() {
		return isStrictRecursive(this.root);
	}
	
	public boolean isStrictRecursive(Node _current) {
		
		if (_current == null) {
			return true;
		}
		
		if ((_current.left != null && _current.right == null) ||
				(_current.left == null && _current.right != null)) {
			return false;
		}
		
		return isStrictRecursive(_current.left) && isStrictRecursive(_current.right);
		
	}
	
	/*
	 * ALTURA DE UN ÁRBOL
	 */
	public int treeHeight() {
		return treeHeightRecursive(this.root);
	}
	
	public int treeHeightRecursive(Node _current) {
		int altura = 0;
		if (_current == null) {
			return altura += 0;
		}
		
		return altura = 1 + Math.max(treeHeightRecursive(_current.left), treeHeightRecursive(_current.right));
	}
	
	/*
	 * VALOR MÁXIMO DE UN ÁRBOL
	 */
	
	
	
	/*
	 * CONTAR NODOS
	 */
	public int countNodes() {
		return countNodesRecursive(this.root);
	}
	
	public int countNodesRecursive(Node _current) {
		int cont = 0;
		if (_current == null) {
			return cont += 0;
		}
		
		return cont = 1 + countNodesRecursive(_current.left) + countNodesRecursive(_current.right);
	}
	
	/*
	 * SUMA NODOS
	 */
	public int sum() {
		return sumRecursive(this.root);
	}
	
	public int sumRecursive(Node _current) {
		int sum = 0;
		if (_current == null) {
			return 0;
		}
		
		return sum = _current.value + sumRecursive(_current.left) + sumRecursive(_current.right);
	}
	
	/*
	 * SUMA NODOS PARES
	 */
	public int sumPares() {
		return sumParesRecursive(this.root);
	}
	
	public int sumParesRecursive(Node _current) {
		int sum;
		if (_current == null) {
			return 0;
		}
		
		if (_current.value % 2 == 0) {
			sum = _current.value;
		} else {
			sum = 0;
		}
		
		return sum + sumParesRecursive(_current.left) + sumParesRecursive(_current.right);
	}

}