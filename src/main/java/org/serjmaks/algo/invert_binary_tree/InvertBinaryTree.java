package org.serjmaks.algo.invert_binary_tree;

public class InvertBinaryTree {

    public TreeNode run(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode left = run(root.left);
        TreeNode right = run(root.right);

        root.right = left;
        root.left = right;

        return root;
    }
}
