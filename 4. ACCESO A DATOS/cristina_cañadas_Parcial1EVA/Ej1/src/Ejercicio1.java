
public class Ejercicio1 {
	public static boolean exists(TreeNode root, int target) {
		if (root == null) {
			return false;
		}
		
		if (root.val == target) {
			return true;
		}
		
		return target > root.val ? exists(root.left, target) : exists(root.right, target);
		
	}
}
