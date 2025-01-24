package org.serjmaks.algo.is_subsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class IsSubsequenceTest {

    @ParameterizedTest
    @MethodSource("arguments")
    public void run(String str1, String str2, boolean expected) {
        assertEquals(expected, IsSubsequence.run(str1, str2));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false)
        );
    }
}
