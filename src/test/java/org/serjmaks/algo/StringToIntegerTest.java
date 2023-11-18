package org.serjmaks.algo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(String string, int expected) {
        assertEquals(expected, StringToInteger.run(string));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("42", 42),
                Arguments.of("   -42", -42),
                Arguments.of("4444 with words", 4444),
                Arguments.of("words and 4444", 0),
                Arguments.of("-3030303030303", Integer.MIN_VALUE),
                Arguments.of("3030303030303", Integer.MAX_VALUE)
        );
    }
}
