
public class Exercise146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 5, 6};
		TreeNode root = sortedArrayToBST(arr);
		transverseTree(root);
	}
	public static TreeNode sortedArrayToBST(int[] arr) {
		if (arr.length == 0) return null;
		return creation(arr, 0, arr.length - 1);
	}
		private static TreeNode creation (int[] arr, int start, int end) {
			TreeNode node = new TreeNode(0);
			if (start == end - 1) {
				node = new TreeNode(arr[start]);
				node.right = new TreeNode(arr[end]);
			} else if (start == end  - 1) {
				return new TreeNode(arr[start]);
			} else {
				int mid = (start + end) / 2;
				node.val = arr[mid];
				node.left = creation(arr, start, mid - 1);
				node.right = creation(arr, mid + 1, end);
			}
			return node;
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
			
		
