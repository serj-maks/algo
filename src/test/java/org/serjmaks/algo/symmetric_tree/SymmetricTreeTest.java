package org.serjmaks.algo.symmetric_tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.TreeNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(TreeNode root, boolean expected) {
        SymmetricTree symmetricTree = new SymmetricTree();
        boolean actual = symmetricTree.run(root);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(TreeNode.createTreeNode(new int[]{1, 2, 2, 3, 4, 4, 3}), true),
                Arguments.of(TreeNode.createTreeNode(new int[]{1, 2, 2, Integer.MIN_VALUE, 3, Integer.MIN_VALUE, 3}), false)
        );
    }
}
