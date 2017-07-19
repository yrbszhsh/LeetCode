/**
 * MergeTwoBinaryTrees
 */
public class InvertBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
        TreeNode() {}
        public void SetLeft(TreeNode left) {
            this.left = left;
        }
        public TreeNode GetLeft(TreeNode left) {
            return left;
        }
        public void SetRight(TreeNode right) {
            this.right = right;
        }
        public TreeNode GetRight(TreeNode right) {
            return right;
        }
    }
    
    public static TreeNode invertTree (TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);

        return root;
    }
    public static void main(String[] args) {
        TreeNode t2 = new TreeNode(2);
        TreeNode t2_left = new TreeNode(1);
        TreeNode t2_right = new TreeNode(3);
        TreeNode t2_left_left = new TreeNode();
        TreeNode t2_left_right = new TreeNode(4);
        TreeNode t2_right_left = new TreeNode();
        TreeNode t2_right_right = new TreeNode(7);
        t2.SetLeft(t2_left);
        t2.SetRight(t2_right);
        t2.left.SetLeft(t2_left_left);
        t2.left.SetRight(t2_left_right);
        t2.right.SetLeft(t2_right_left);
        t2.right.SetRight(t2_right_right);
        TreeNode t3 = new TreeNode();
        t3 = invertTree(t2);
        System.out.println(t3.val);
        System.out.println(t3.left.val);
        System.out.println(t3.right.val);
        System.out.println(t3.left.left.val);
        System.out.println(t3.left.right.val);
        System.out.println(t3.right.left.val);
        System.out.println(t3.right.right.val);
    }
}