package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[] nums, List<List<Integer>> expected) {
        assertEquals(expected, Subsets.run(nums));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3}, List.of(List.of(), List.of(1), List.of(1,2), List.of(1,2,3), List.of(1,3), List.of(2), List.of(2,3), List.of(3))),
                Arguments.of(new int[]{}, List.of(List.of()))
        );
    }
}