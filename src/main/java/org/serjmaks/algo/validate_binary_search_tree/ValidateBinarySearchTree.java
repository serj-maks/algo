package org.serjmaks.algo.validate_binary_search_tree;

import org.serjmaks.algo.TreeNode;

public class ValidateBinarySearchTree {
    public static boolean run(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBST(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }

        if (root.val >= maxValue || root.val <= minValue) {
            return false;
        }

        return isValidBST(root.left, minValue, root.val)
                && isValidBST(root.right, root.val, maxValue);
    }
}
