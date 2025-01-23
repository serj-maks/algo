package org.serjmaks.algo.validate_binary_search_tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.TreeNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(TreeNode root, boolean expected) {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        boolean actual = validateBinarySearchTree.run(root);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(TreeNode.createTreeNode(new int[]{2, 1, 3}), true),
                Arguments.of(TreeNode.createTreeNode(new int[]{5, 1, 4, Integer.MIN_VALUE, Integer.MIN_VALUE, 3, 6}), false)
        );
    }
}
