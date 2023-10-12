package org.serjmaks.algo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[] nums, int expected) {
        assertEquals(expected, MajorityElement.run(nums));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{2,1,2}, 2),
                Arguments.of(new int[]{2,2,1,1,1,2,2}, 2),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1,2}, 0)
        );
    }
}
