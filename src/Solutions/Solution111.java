package Solutions;

import auxiliarclasses.TreeNode;

class Solution111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.right == null && root.left == null) return 1;
        return 1 + Math.min(root.left == null ? Integer.MAX_VALUE : minDepth(root.left),
                root.right == null ? Integer.MAX_VALUE : minDepth(root.right));
    }

}