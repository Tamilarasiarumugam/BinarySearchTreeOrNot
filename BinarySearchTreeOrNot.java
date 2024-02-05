package assignments;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}


public class BinarySearchTreeOrNot {
	
	 public static boolean isBST(TreeNode root) {
	        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	    }

	    private static boolean isBST(TreeNode node, int minValue, int maxValue) {
	        if (node == null) {
	            return true;
	        }

	        if (node.val < minValue || node.val > maxValue) {
	            return false;
	        }

	        
	        return isBST(node.left, minValue, node.val - 1) && isBST(node.right, node.val + 1, maxValue);
	    }

	    public static void main(String[] args) {
	        TreeNode root = new TreeNode(2);
	        root.left = new TreeNode(1);
	        root.right = new TreeNode(3);

	        boolean isBST = isBST(root);
	        if (isBST) {
	            System.out.println("The binary tree is a Binary Search Tree.");
	        } else {
	            System.out.println("The binary tree is not a Binary Search Tree.");
	        }
	    }
	
	

}

