package org.serjmaks.algo.path_sum;

import org.serjmaks.algo.TreeNode;

public class PathSum {
    public boolean run(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        return run(root.left, targetSum - root.val)
                || run(root.right, targetSum - root.val);
    }
}
