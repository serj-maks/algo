package org.serjmaks.algo.maximum_product_subarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[] nums, int expected) {
        assertEquals(expected, MaximumProductSubarray.run(nums));
    }

    private static Stream<Arguments> arguments () {
        return Stream.of(
                Arguments.of(new int[]{2, 3, -2, 4}, 6),
                Arguments.of(new int[]{-2, 0, -1}, 0)
        );
    }
}
