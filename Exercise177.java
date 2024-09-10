
public class Exercise177 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        System.out.println("Original TreeNode:");
        transverseTree(t1);
        System.out.println("\nClone of the said Treenode:");
        TreeNode result = cloneTree(t1);
        transverseTree(result);
	}
        public static TreeNode cloneTree(TreeNode root) {
        	if (root == null) {
        		return null;
        	}
        	TreeNode dup = new TreeNode(root.val);
        	dup.left = cloneTree(root.left);
        	dup.right = cloneTree(root.right);
        	return dup;
        }
        private static void transverseTree(TreeNode root) {
        	if (root != null) {
        		transverseTree(root.left);
        		transverseTree(root.right);
        		System.out.println(root.val);
        	}
        }
}
class TreeNode {
	public int val;
	public TreeNode left, right;
	public TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}
}
        			
