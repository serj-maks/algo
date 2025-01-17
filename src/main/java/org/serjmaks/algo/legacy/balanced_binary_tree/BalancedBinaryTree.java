package org.serjmaks.algo.legacy.balanced_binary_tree;

public class BalancedBinaryTree {
    public boolean run(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }

        return run(root.left) && run(root.right);
    }

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
