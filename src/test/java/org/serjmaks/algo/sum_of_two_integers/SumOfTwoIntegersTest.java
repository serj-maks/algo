package org.serjmaks.algo.sum_of_two_integers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoIntegersTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int a, int b, int expected) {
       assertEquals(SumOfTwoIntegers.run(a, b), expected);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(3, 5, 8),
                Arguments.of(0, 3, 3),
                Arguments.of(5, 0, 5),
                Arguments.of(0, 0, 0)
        );
    }

}