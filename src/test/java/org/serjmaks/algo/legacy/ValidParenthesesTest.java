package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(String s, boolean expected) {
        assertEquals(expected, ValidParentheses.run(s));
    }

    private static Stream<Arguments> arguments () {
        return Stream.of(
                Arguments.of("()[]{}", true),
                Arguments.of("[{()}]", true),
                Arguments.of("[{()}", false),
                Arguments.of("[{))}]", false)
        );
    }
}