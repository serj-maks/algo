package org.serjmaks.algo.merge_two_sorted_lists;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.serjmaks.algo.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    @ParameterizedTest
    @MethodSource("arguments")
    void run(ListNode list1, ListNode list2, ListNode expected) {
        assertEquals(expected, MergeTwoSortedLists.run(list1, list2));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(ListNode.createList(new int[]{1, 2, 4}), ListNode.createList(new int[]{1, 3, 4}), ListNode.createList(new int[]{1, 1, 2, 3, 4, 4})),
                Arguments.of(ListNode.createList(new int[]{}), ListNode.createList(new int[]{}), ListNode.createList(new int[]{})),
                Arguments.of(ListNode.createList(new int[]{}), ListNode.createList(new int[]{0}), ListNode.createList(new int[]{0}))
        );
    }

}