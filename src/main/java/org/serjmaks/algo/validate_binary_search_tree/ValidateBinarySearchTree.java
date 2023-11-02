package org.serjmaks.algo.validate_binary_search_tree;

import java.util.Stack;

public class ValidateBinarySearchTree {
    public static boolean run(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double leftChildVal = -Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if (root.val <= leftChildVal) {
                return false;
            }

            leftChildVal = root.val;
            root = root.right;
        }

        return true;
    }
}
