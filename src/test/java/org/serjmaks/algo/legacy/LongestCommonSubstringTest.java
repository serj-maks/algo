package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubstringTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void longestPalindrome(String s, String expected) {
        assertEquals(expected, LongestCommonSubstring.run(s));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("babad", "aba"),
                Arguments.of("cbbd", "bb")
        );
    }
}