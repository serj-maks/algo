package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(String ransomNote, String magazine, boolean expected) {
        assertEquals(expected, RansomNote.run(ransomNote, magazine));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("a", "b", false),
                Arguments.of("aa", "ab", false),
                Arguments.of("aa", "aab", true),
                Arguments.of("aa", "aba", true)
        );
    }
}