package org.serjmaks.algo.binary_tree_level_order_traversal;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.TreeNode;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(TreeNode root, List<List<Integer>> expected) {
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = traversal.run(root);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(TreeNode.createTreeNode(new int[]{3, 9, 20, Integer.MIN_VALUE, Integer.MIN_VALUE, 15, 7}), List.of(List.of(3), List.of(9, 20), List.of(15, 7))),
                Arguments.of(TreeNode.createTreeNode(new int[]{1}), List.of(List.of(1))),
                Arguments.of(TreeNode.createTreeNode(new int[]{}), List.of())
        );
    }
}
