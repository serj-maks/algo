package org.serjmaks.algo.diameter_of_binary_tree;

public class TreeNode {

    int val;
    TreeNode right;
    TreeNode left;

    TreeNode() {

    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode right, TreeNode left) {
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
