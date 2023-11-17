package org.serjmaks.algo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PartitionEqualSubsetSumTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[] nums, boolean expected) {
        assertEquals(expected, PartitionEqualSubsetSum.run(nums));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 5, 11, 5}, true),
                Arguments.of(new int[]{1, 2, 3, 5}, false)
        );
    }
}
