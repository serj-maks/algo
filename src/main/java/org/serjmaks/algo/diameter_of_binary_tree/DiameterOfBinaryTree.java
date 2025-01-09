package org.serjmaks.algo.diameter_of_binary_tree;

//TODO: add test
public class DiameterOfBinaryTree {
    int diameter = 0;

    public int run(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        findHeight(root);
        return diameter;
    }

    private int findHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
