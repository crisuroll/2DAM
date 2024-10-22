
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
		
		BST tree2 = new BST();
		tree2.addNode(7);
		tree2.addNode(2);
		tree2.addNode(1);
		tree2.addNode(5);
		tree2.addNode(9);
		tree2.addNode(8);
		tree2.addNode(10);
		
		/*tree.preOrden();
		System.out.println();
		tree.postOrden();
		System.out.println();
		tree.inOrden();*/
		
		// System.out.println(tree.isStrict());
		// System.out.println(tree.treeHeight());
		// System.out.println(tree.maxValue());
		// System.out.println(tree.countNodes());
		System.out.println(tree.equal(tree2));
		// System.out.println(tree.countLeaves());
		// System.out.println(tree.sum());
		// System.out.println(tree.sumPares());
		
	}

}
