package org.serjmaks.algo.subtree_of_another_tree;

import org.serjmaks.algo.TreeNode;

public class SubtreeOfAnotherTree {
    public static boolean run(TreeNode root, TreeNode subRoot) {
        if(root == null) {
            return false;
        }

        if(root.val == subRoot.val) {
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }

        return run(root.left, subRoot) || run(root.right, subRoot);
    }

    public static boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) {
            return true;
        }

        if(root == null || subRoot == null || root.val != subRoot.val) {
            return false;
        }

        if(!isIdentical(root.left, subRoot.left)) {
            return false;
        }

        if(!isIdentical(root.right, subRoot.right)) {
            return false;
        }

        return true;
    }
}
