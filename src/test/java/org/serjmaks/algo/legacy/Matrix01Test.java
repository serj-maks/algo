package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Matrix01Test {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[][] matrix, int[][] expected) {
        assertEquals(Arrays.toString(expected), Arrays.toString(Matrix01.run(matrix)));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[][]{{0,0,0}, {0,1,0}, {0,0,0}}, new int[][]{{0,0,0}, {0,1,0}, {0,0,0}}),
                Arguments.of(new int[][]{{0,0,0}, {0,1,0}, {1,1,1}}, new int[][]{{0,0,0}, {0,1,0}, {1,2,1}})
        );
    }
}