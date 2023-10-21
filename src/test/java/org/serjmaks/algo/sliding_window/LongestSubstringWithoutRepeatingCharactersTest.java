package org.serjmaks.algo.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(String s, int expected) {
        assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.run(s));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("abcabbcb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("aababcddac", 4)
        );
    }
}