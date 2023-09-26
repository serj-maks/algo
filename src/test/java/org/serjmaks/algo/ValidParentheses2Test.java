package org.serjmaks.algo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidParentheses2Test {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(String s, boolean expected) {
        assertEquals(expected, ValidParentheses2.run(s));
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