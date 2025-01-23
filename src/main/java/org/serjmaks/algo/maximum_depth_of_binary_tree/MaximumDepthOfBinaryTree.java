package org.serjmaks.algo.maximum_depth_of_binary_tree;

import org.serjmaks.algo.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int run(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepthValue = run(root.left);
        int rightDepthValue = run(root.right);

        return 1 + Math.max(leftDepthValue, rightDepthValue);
    }
}
