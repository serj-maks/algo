package org.serjmaks.algo.invert_binary_tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.TreeNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(TreeNode root, TreeNode expected) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode result = invertBinaryTree.run(root);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(TreeNode.createTreeNode(new int[]{4, 2, 7, 1, 3, 6, 9}), TreeNode.createTreeNode(new int[]{4, 7, 2, 9, 6, 3, 1})),
                Arguments.of(TreeNode.createTreeNode(new int[]{2, 1, 3}), TreeNode.createTreeNode(new int[]{2,3,1})),
                Arguments.of(TreeNode.createTreeNode(new int[]{}), TreeNode.createTreeNode(new int[]{}))
        );
    }
}
