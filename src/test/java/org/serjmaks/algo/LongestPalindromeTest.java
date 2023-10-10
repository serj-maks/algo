package org.serjmaks.algo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(String s, int expected) {
        assertEquals(expected, LongestPalindrome.run(s));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("ab", 1),
                Arguments.of("abccccdd", 7),
                Arguments.of("aabbc", 5)
        );
    }
}