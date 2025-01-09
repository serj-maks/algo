package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[] nums, List<List<Integer>> expected) {
        assertEquals(expected, Permutations.run(nums));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, List.of(List.of(3, 2, 1), List.of(2, 3, 1), List.of(2, 1, 3), List.of(3, 1, 2), List.of(1, 3, 2), List.of(1, 2, 3))),
                Arguments.of(new int[]{0, 1}, List.of(List.of(1, 0), List.of(0, 1))),
                Arguments.of(new int[]{1}, List.of(List.of(1)))
        );
    }
}