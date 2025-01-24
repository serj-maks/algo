package org.serjmaks.algo.remove_duplicates_from_sorted_list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(ListNode head, ListNode expected) {
        assertEquals(expected, RemoveDuplicatesFromSortedList.run(head));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(ListNode.createList(new int[]{1, 1, 2}), ListNode.createList(new int[]{1, 2})),
                Arguments.of(ListNode.createList(new int[]{1, 1, 2, 3, 3}), ListNode.createList(new int[]{1, 2, 3}))
        );
    }
}
