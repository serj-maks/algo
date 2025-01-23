package org.serjmaks.algo.symmetric_tree;

import org.serjmaks.algo.TreeNode;

public class SymmetricTree {
    public boolean run(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return isSymmetricSubTree(root.left, root.right);
        }
    }

    private boolean isSymmetricSubTree(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }

        if (left.val != right.val) {
            return false;
        }

        return isSymmetricSubTree(left.left, right.right)
                && isSymmetricSubTree(left.right, right.left);
    }
}
