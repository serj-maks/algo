package org.serjmaks.algo.invert_binary_tree;

import org.serjmaks.algo.TreeNode;

public class InvertBinaryTree {
    public TreeNode run(TreeNode root) {
        if (root == null) {
            return root;
        }

        run(root.left);
        run(root.right);

        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        return root;
    }
}
