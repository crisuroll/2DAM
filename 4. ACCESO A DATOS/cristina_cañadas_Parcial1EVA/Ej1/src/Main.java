
public class Main {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		if (Ejercicio1.exists(root,4)) {
			System.out.println("El valor SI existe en el arbol.");
		} else {
			System.out.println("El valor NO existe en el arbol.");
		}

	}

}
