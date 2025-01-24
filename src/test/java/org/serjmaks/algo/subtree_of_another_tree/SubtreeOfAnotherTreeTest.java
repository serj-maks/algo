package org.serjmaks.algo.subtree_of_another_tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.TreeNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SubtreeOfAnotherTreeTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(TreeNode root, TreeNode subRoot, boolean expected) {
        assertEquals(expected, SubtreeOfAnotherTree.run(root, subRoot));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(TreeNode.createTreeNode(new int[]{3, 4, 5, 1, 2}), TreeNode.createTreeNode(new int[]{4, 1, 2}), true),
                Arguments.of(TreeNode.createTreeNode(new int[]{3, 4, 5, 1, 2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 0}), TreeNode.createTreeNode(new int[]{4, 1, 2}), false)
        );
    }
}
