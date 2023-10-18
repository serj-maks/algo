package org.serjmaks.algo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[][] intervals, int[] newInterval, int[][] expected) {
        assertEquals(Arrays.toString(expected),
                     Arrays.toString(InsertInterval.run(intervals, newInterval)
                     ));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}, new int[][]{{1, 5}, {6, 9}}),
                Arguments.of(new int[][]{{0, 0}, {0, 0}}, new int[]{0, 0}, new int[][]{{0, 0}, {0, 0}}),
                Arguments.of(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}, new int[][]{{1, 2}, {3, 10}, {12, 16}})
        );
    }
}
