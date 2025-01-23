package org.serjmaks.algo.lowest_common_ancestor_of_a_bst;

import org.junit.jupiter.api.Test;
import org.serjmaks.algo.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorOfABinaryTreeTest {

    @Test
    void case01_shouldReturnRoot() {
        TreeNode root = TreeNode.createTreeNode(new int[]{6, 2, 8, 0, 4, 7, 9, Integer.MIN_VALUE, Integer.MIN_VALUE, 3, 5});
        //для переменных p и q можно использовать указание путей root напрямую
        //например, до ноды 5 путь буде выглядеть так: root.left.right.right
        TreeNode p = root.left;
        TreeNode q = root.right;
        LowestCommonAncestorOfABinaryTree lowestCommonAncestorOfABinaryTree = new LowestCommonAncestorOfABinaryTree();
        TreeNode result = lowestCommonAncestorOfABinaryTree.run(root, p, q);
        assertEquals(root, result);
    }

    @Test
    void case02_shouldReturnRootLeft() {
        TreeNode root = TreeNode.createTreeNode(new int[]{6, 2, 8, 0, 4, 7, 9, Integer.MIN_VALUE, Integer.MIN_VALUE, 3, 5});
        //для переменных p и q можно использовать создание нового объекта TreeNode,
        //т.к. в алгоритме используется только p.val и q.val значения
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);
        LowestCommonAncestorOfABinaryTree lowestCommonAncestorOfABinaryTree = new LowestCommonAncestorOfABinaryTree();
        TreeNode result = lowestCommonAncestorOfABinaryTree.run(root, p, q);
        assertEquals(root.left, result);
    }
}
