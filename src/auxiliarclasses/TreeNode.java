package auxiliarclasses;

public class TreeNode {
    public TreeNode right;
    public TreeNode left;
    int val;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
