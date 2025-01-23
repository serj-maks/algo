package org.serjmaks.algo.same_tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.TreeNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(TreeNode p, TreeNode q, boolean expected) {
        SameTree sameTree = new SameTree();
        boolean result = sameTree.run(p, q);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(TreeNode.createTreeNode(new int[]{1, 2, 3}), TreeNode.createTreeNode(new int[]{1, 2, 3}), true),
                Arguments.of(TreeNode.createTreeNode(new int[]{1, 2}), TreeNode.createTreeNode(new int[]{1, Integer.MIN_VALUE, 2}), false),
                Arguments.of(TreeNode.createTreeNode(new int[]{1, 2, 3}), TreeNode.createTreeNode(new int[]{1, 1, 2}), false)
        );
    }
}
