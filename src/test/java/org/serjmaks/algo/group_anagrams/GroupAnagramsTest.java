package org.serjmaks.algo.group_anagrams;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void paramRun(String[] strs, List<List<String>> expected) {
        assertEquals(expected, GroupAnagrams.run(strs));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}, List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat"))),
                Arguments.of(new String[]{""}, List.of(List.of(""))),
                Arguments.of(new String[]{"a"}, List.of(List.of("a")))
        );
    }

}