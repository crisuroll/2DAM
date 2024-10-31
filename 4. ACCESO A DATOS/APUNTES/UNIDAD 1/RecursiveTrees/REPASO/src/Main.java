
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
		
		System.out.println(tree.altura());

	}

}
