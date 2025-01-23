package org.serjmaks.algo.kth_smallest_element_in_a_bst;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.TreeNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementInABstTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(TreeNode root, int k, int expected) {
        KthSmallestElementInABst kthSmallest = new KthSmallestElementInABst();
        int result = kthSmallest.kthSmallest(root, k);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(TreeNode.createTreeNode(new int[]{3, 1, 4, Integer.MIN_VALUE, 2}), 1, 1),
                Arguments.of(TreeNode.createTreeNode(new int[]{5, 3, 6, 2, 4, Integer.MIN_VALUE, Integer.MIN_VALUE, 1}), 3, 3)
        );
    }
}
