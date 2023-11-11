package org.serjmaks.algo.lowest_common_ancestor_of_a_binary_tree;

public class LowestCommonAncestorOfABinaryTree2 {
    public static TreeNode run(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) {
            return run(root.left, p, q);
        }

        if (p.val > root.val && q.val > root.val) {
            return run(root.right, p, q);
        }

        return root;
    }
}
