package org.serjmaks.algo.invert_binary_tree;

public class InvertBinaryTree2 {
    public TreeNode run(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode temp = root.left;
        root.left = run(root.right);
        root.right = run(temp);

        return root;
    }

}
