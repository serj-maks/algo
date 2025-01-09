package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int m, int n, int expected) {
        assertEquals(expected, UniquePaths.run(m, n));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(3, 2, 3),
                Arguments.of(3, 7, 28)
        );
    }
}
