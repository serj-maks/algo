package org.serjmaks.algo.binary_tree_maximum_path_sum;

import org.serjmaks.algo.TreeNode;

public class BinaryTreeMaximumPathSum {
    int globalMax = Integer.MIN_VALUE;

    public int run(TreeNode root) {
        helper(root);
        return globalMax;
}

    int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);

        globalMax = Math.max(globalMax, root.val + left + right);
        int localMax = root.val + Math.max(left, right);

        return localMax;
    }
}
