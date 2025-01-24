package org.serjmaks.algo.roman_to_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(String romanNumber, int expected) {
        assertEquals(expected, RomanToInteger.run(romanNumber));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)
        );
    }
}
