package org.serjmaks.algo.spiral_matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[][] matrix, List<Integer> expected) {
        assertEquals(expected, SpiralMatrix.run(matrix));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}, List.of(1,2,3,6,9,8,7,4,5)),
                Arguments.of(new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}}, List.of(1,2,3,4,8,12,11,10,9,5,6,7))
        );
    }
}
