package org.serjmaks.algo.binary_tree_maximum_path_sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.TreeNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaximumPathSumTest {
    @ParameterizedTest
    @MethodSource("arguments")
    void run(TreeNode root, int expected) {
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        int result = binaryTreeMaximumPathSum.run(root);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(TreeNode.createTreeNode(new int[]{1, 2, 3}), 6),
                Arguments.of(TreeNode.createTreeNode(new int[]{-10, 9, 20, Integer.MIN_VALUE, Integer.MIN_VALUE, 15, 7}), 42)
        );
    }
}
