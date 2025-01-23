package org.serjmaks.algo.maximum_depth_of_binary_tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.TreeNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(TreeNode root, int expected) {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        int result = maximumDepthOfBinaryTree.run(root);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(TreeNode.createTreeNode(new int[]{3, 9, 20, Integer.MIN_VALUE, Integer.MIN_VALUE, 15, 7}), 3),
                Arguments.of(TreeNode.createTreeNode(new int[]{1, Integer.MIN_VALUE, 2}), 2)
        );
    }
}
