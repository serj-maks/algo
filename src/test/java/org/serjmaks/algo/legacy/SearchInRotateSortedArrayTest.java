package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotateSortedArrayTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[] nums, int target, int expected) {
        assertEquals(expected, SearchInRotateSortedArray.run(nums, target));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{4,5,6,7,0,1,2}, 0, 4),
                Arguments.of(new int[]{4,5,6,7,0,1,2}, 3, -1),
                Arguments.of(new int[]{1}, 0, -1)
        );
    }
}