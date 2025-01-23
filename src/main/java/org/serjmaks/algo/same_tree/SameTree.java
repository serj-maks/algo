package org.serjmaks.algo.same_tree;

import org.serjmaks.algo.TreeNode;

public class SameTree {
    public boolean run(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return run(p.left, q.left)
                && run(p.right, q.right);
    }
}
