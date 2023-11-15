package org.serjmaks.algo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void run(int[] nums, int[] expected) {
        SortColors.run(nums);
        assertTrue(Arrays.equals(expected, nums));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{2,0,2,1,1,0}, new int[]{0,0,1,1,2,2}),
                Arguments.of(new int[]{2,0,1}, new int[]{0,1,2})
        );
    }
}
