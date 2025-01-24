package org.serjmaks.algo.reverse_linked_list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(ListNode head, ListNode expected) {
        assertEquals(expected, ReverseLinkedList.run(head));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(ListNode.createList(new int[]{1, 2, 3, 4, 5}), ListNode.createList(new int[]{5, 4, 3, 2, 1})),
                Arguments.of(ListNode.createList(new int[]{1, 2}), ListNode.createList(new int[]{2, 1}))
        );
    }
}
