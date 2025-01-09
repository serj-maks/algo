package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[][] intervals, int[][] expected) {
        //TODO: Arrays.equals doesn't work for int[][], add useful test case
        assertTrue(Arrays.equals(expected, MergeIntervals.run(intervals)));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}, new int[][]{{1, 6}, {8, 10}, {15, 18}}),
                Arguments.of(new int[][]{{1, 4}, {4, 5}}, new int[][]{{1, 5}})
        );
    }
}