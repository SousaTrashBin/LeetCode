package Solutions;

import auxiliarclasses.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode, List<TreeNode>> ancestorMap = new HashMap<>();
        getAncestorMap(root, new ArrayList<TreeNode>(), ancestorMap, q);
        getAncestorMap(root, new ArrayList<TreeNode>(), ancestorMap, p);
        List<TreeNode> pAncestorList = ancestorMap.get(p);
        List<TreeNode> qAncestorList = ancestorMap.get(q);
        return pAncestorList.stream().filter(qAncestorList::contains).toList().getLast();
    }

    private void getAncestorMap(TreeNode root, ArrayList<TreeNode> treeNodeList,
                                Map<TreeNode, List<TreeNode>> treeNodeListHashMap, TreeNode q) {
        if (root == null) return;
        else if (q.equals(root))
            treeNodeListHashMap.put(root, treeNodeList);
        treeNodeList.add(root);
        getAncestorMap(root.left, new ArrayList<>(treeNodeList), treeNodeListHashMap, q);
        getAncestorMap(root.right, new ArrayList<>(treeNodeList), treeNodeListHashMap, q);
    }

}
