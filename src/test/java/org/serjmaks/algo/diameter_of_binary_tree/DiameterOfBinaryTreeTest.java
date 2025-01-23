package org.serjmaks.algo.diameter_of_binary_tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.TreeNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DiameterOfBinaryTreeTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[] tree, int expected) {
        TreeNode root = TreeNode.createTreeNode(tree);
        DiameterOfBinaryTree diameterCalculator = new DiameterOfBinaryTree(); //не стал делать static-метод "run" в классе DiameterOfBinaryTree
        int result = diameterCalculator.run(root);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 3), // диаметр = 3 (пути: 4->2->1->3 или 5->2->1->3)
                Arguments.of(new int[]{1, 2, 3, Integer.MIN_VALUE, 4}, 3), // диаметр = 3 (путь: 4->2->1->3)
                Arguments.of(new int[]{1}, 0), // диаметр = 0, т.к. одноузловое дерево
                Arguments.of(new int[]{}, 0) // диаметр = 0, т.к. пустое дерево
        );
    }
}
