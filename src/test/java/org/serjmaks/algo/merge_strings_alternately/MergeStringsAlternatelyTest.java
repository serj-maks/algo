package org.serjmaks.algo.merge_strings_alternately;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(String word1, String word2, String expected) {
        assertEquals(expected, MergeStringsAlternately.run(word1, word2));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd")
        );
    }
}
