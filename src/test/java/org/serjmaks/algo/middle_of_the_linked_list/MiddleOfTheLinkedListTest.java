package org.serjmaks.algo.middle_of_the_linked_list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleOfTheLinkedListTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(ListNode head, int expected) {
        ListNode actual = MiddleOfTheLinkedList.run(head);
        assertEquals(expected, actual.val);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(ListNode.createList(new int[]{1,2,3,4,5}), 3),
                Arguments.of(ListNode.createList(new int[]{1,2,3,4,5,6}), 4)
        );
    }
}