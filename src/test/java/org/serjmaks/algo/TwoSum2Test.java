package org.serjmaks.algo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSum2Test {

    @ParameterizedTest
    @MethodSource("arguments")
    public void run(int[] nums, int target, int[] expected) {
        assertEquals(Arrays.toString(expected),
                     Arrays.toString(TwoSum2.run(nums, target)
                     ));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, 9, new int[]{4,5}),
                Arguments.of(new int[]{1,2,3,4,5}, 10, new int[]{}),
                Arguments.of(new int[]{}, 9, new int[]{})
        );
    }
}