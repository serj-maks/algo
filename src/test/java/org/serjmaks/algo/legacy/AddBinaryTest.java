package org.serjmaks.algo.legacy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(String a, String b, String expected) {
        assertEquals(expected, AddBinary.run(a, b));
    }

    private static Stream<Arguments> arguments () {
        return Stream.of(
                Arguments.of("11", "1", "100"),
                Arguments.of("1010", "1011", "10101")
        );
    }
}