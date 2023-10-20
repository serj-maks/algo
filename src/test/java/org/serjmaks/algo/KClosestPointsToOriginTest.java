package org.serjmaks.algo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KClosestPointsToOriginTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[][] points, int k, int[][] expected) {
        assertEquals(Arrays.toString(expected),
                     Arrays.toString(KClosestPointsToOrigin.run(points, k)));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1,3}, {-2,2}}, 1, new int[][]{{-2,2}}),
                Arguments.of(new int[][]{{3,3}, {5,-1}, {-2,4}}, 2, new int[][]{{-2,4}, {3,3}})
        );
    }
}