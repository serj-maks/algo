package org.serjmaks.algo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(String s, List<String> wordDict, boolean expected) {
        assertEquals(expected, WordBreak.run(s, wordDict));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("leetcode", List.of("leet", "code"), true),
                Arguments.of("applepenapple", List.of("apple", "pen"), true),
                Arguments.of("catsandog", List.of("cat", "sand", "dog", "and", "cat"), false)
        );
    }
}