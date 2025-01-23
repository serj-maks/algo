package org.serjmaks.algo.valid_anagram;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
class ValidAnagramTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void paramRun(String s, String t, boolean expected) {
        assertEquals(expected, ValidAnagram.run(s,t));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("rat", "tar", true),
                Arguments.of("root", "root", true),
                Arguments.of("root", "roo", false),
                Arguments.of("", "rat", false),
                Arguments.of("", "", true)
        );
    }
}
