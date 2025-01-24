package org.serjmaks.algo.valid_palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(String str, boolean expected) {
        assertEquals(expected, ValidPalindrome.run(str));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of(" ", true)
        );
    }
}
