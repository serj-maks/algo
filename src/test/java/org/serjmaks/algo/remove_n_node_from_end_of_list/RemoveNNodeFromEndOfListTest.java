package org.serjmaks.algo.remove_n_node_from_end_of_list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNNodeFromEndOfListTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(ListNode head, int n, ListNode expected) {
        assertEquals(expected, RemoveNNodeFromEndOfList.run(head, n));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(ListNode.createList(new int[]{1, 2, 3, 4, 5}), 2, ListNode.createList(new int[]{1, 2, 3, 5})),
                Arguments.of(ListNode.createList(new int[]{1}), 1, ListNode.createList(new int[]{})),
                Arguments.of(ListNode.createList(new int[]{1, 2}), 1, ListNode.createList(new int[]{1}))
        );
    }
}
