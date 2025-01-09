package org.serjmaks.algo.legacy.middle_of_the_linked_list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[] nums, int expected) {
        ListNode head = ListNode.createList(nums);
        ListNode result = MiddleOfTheLinkedList.run(head);
        assertEquals(expected, result.val);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, 3),
                Arguments.of(new int[]{1,2,3,4,5,6}, 4)
        );
    }
}