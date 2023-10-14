package org.serjmaks.algo.diameter_of_binary_tree;

public class DiameterOfBinaryTree {

    static int max = Integer.MAX_VALUE;

    // use int to hold the diameter
    public static int run(TreeNode root) {
        height(root);
        return max;
    }

    private static int height(TreeNode node) {
        int left = 0;
        int right = 0;

        if (node.left != null) {
            left = height(node.left);
        }

        if (node.right != null) {
            right = height(node.right);
        }

        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
