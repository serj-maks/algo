package org.serjmaks.algo.path_sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.TreeNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(TreeNode root, int targetSum, boolean expected) {
        PathSum pathSum = new PathSum();
        boolean actual = pathSum.run(root, targetSum);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(TreeNode.createTreeNode(new int[]{5, 4, 8, 11, Integer.MIN_VALUE, 13, 4, 7, 2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 1}), 22, true),
                Arguments.of(TreeNode.createTreeNode(new int[]{1, 2, 3}), 5, false)
        );
    }
}
