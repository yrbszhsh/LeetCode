/**
 * MergeTwoBinaryTrees
 */
public class MergeTwoBinaryTrees {
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
    
    public static TreeNode MergeTwoBinaryTrees (TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        int val = (t1 == null? 0 : t1.val) + (t2 == null? 0 : t2.val);
        TreeNode newNote = new TreeNode(val);
        
        newNote.left = MergeTwoBinaryTrees(t1 == null? null : t1.left, t2 == null? null : t2.left);
        newNote.right = MergeTwoBinaryTrees(t1 == null? null : t1.right, t2 == null? null : t2.right);

        return newNote;
    }
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t1_left = new TreeNode(3);
        TreeNode t1_right = new TreeNode(2);
        TreeNode t1_left_left = new TreeNode(5);
        t1.SetLeft(t1_left);
        t1.SetRight(t1_right);
        t1.left.SetLeft(t1_left_left);
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
        t3 = MergeTwoBinaryTrees(t1, t2);
        System.out.println(t3.val);
        System.out.println(t3.left.val);
        System.out.println(t3.right.val);
        System.out.println(t3.left.left.val);
        System.out.println(t3.left.right.val);
        System.out.println(t3.right.left.val);
        System.out.println(t3.right.right.val);
    }
}