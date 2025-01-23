package org.serjmaks.algo.lowest_common_ancestor_of_a_bst;

import org.serjmaks.algo.TreeNode;

public class LowestCommonAncestorOfABinaryTree {
    public static TreeNode run(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        if (p.val == root.val || q.val == root.val) {
            return root;
        }

        if (root.val > p.val && root.val > q.val) {
            return run(root.left, p, q);
        }

        if (root.val < p.val && root.val < q.val) {
            return run(root.right, p, q);
        }

        return root;
    }
}
