package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[][] grid, int expected) {
        assertEquals(expected, RottingOranges.run(grid));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[][]{{2,1,1}, {1,1,0}, {0,1,1}}, 4),
                Arguments.of(new int[][]{{2,1,1}, {0,1,1}, {1,0,1}}, -1),
                Arguments.of(new int[][]{{0,2}}, 0)
        );
    }
}