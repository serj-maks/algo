package org.serjmaks.algo.longest_common_prefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(String[] strs, String expected) {
        assertEquals(expected, LongestCommonPrefix.run(strs));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new String[]{"flower","flow","flight"}, "fl"),
                Arguments.of(new String[]{"dog","racecar","car"}, "")
        );
    }
}
