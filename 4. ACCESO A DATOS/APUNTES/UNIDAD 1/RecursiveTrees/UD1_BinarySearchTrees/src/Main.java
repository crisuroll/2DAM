
public class Main {

	public static void main(String[] args) {
		
		BST tree = new BST();
		tree.addNode(6);
		tree.addNode(2);
		tree.addNode(1);
		tree.addNode(5);
		tree.addNode(9);
		tree.addNode(8);
		tree.addNode(10);
		
		/*tree.preOrden();
		System.out.println();
		tree.postOrden();
		System.out.println();
		tree.inOrden();*/
		
		// System.out.println(tree.isStrict());
		
		System.out.println(tree.treeHeight());

	}

}
