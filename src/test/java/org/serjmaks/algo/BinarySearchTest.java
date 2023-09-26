package org.serjmaks.algo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[] nums, int target, int expected) {
        assertEquals(expected, BinarySearch.run(nums, target));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, 5, 4),
                Arguments.of(new int[]{0}, 0, 0),
                Arguments.of(new int[]{1,2,3,4,5}, 6, -1),
                Arguments.of(new int[]{0}, 5, -1)
        );
    }
}