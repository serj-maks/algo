package org.serjmaks.algo.kth_smallest_element_in_a_bst;

import org.serjmaks.algo.TreeNode;

public class KthSmallestElementInABst {
    public int kthSmallest(TreeNode root, int k) {
        int count = countNodes(root.left);
        if (k <= count) {
            return kthSmallest(root.left, k);
        } else if (k > count + 1) {
            return kthSmallest(root.right, k-1-count);
        }

        return root.val;
    }

    public int countNodes(TreeNode n) {
        if (n == null) {
            return 0;
        }

        return 1 + countNodes(n.left) + countNodes(n.right);
    }
}
