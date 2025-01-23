package org.serjmaks.algo.find_closest_number_to_zero;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindClosestNumberToZeroTest {
    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[] nums, int expected) {
        assertEquals(expected, FindClosestNumberToZero.run(nums));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{-4, -2, 1, 4, 8}, 1),
                Arguments.of(new int[]{2, -1, 1},1)
        );
    }
}
