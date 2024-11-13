
public class BST {
	
	Node root;
	
	public void add(int _value) {
		this.root = addRecursive(this.root, _value);
	}
	
	private Node addRecursive(Node _current, int _value) {
		if (_current == null) {
			return new Node(_value);
		}
		
		if (_value < _current.value) {
			_current.left = addRecursive(_current.left, _value);
		} else if (_value > _current.value) {
			_current.right = addRecursive(_current.right, _value);
		} else {
			return _current;
		}
		
		return _current;
	}
	
	public void preOrder() {
		traversePreOrder(this.root);
	}
	
	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.println(" " + node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}
}
