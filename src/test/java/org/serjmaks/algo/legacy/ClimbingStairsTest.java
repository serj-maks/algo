package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int stairs, int expected) {
        assertEquals(expected, ClimbingStairs.run(stairs));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(4, 5)
        );
    }
}