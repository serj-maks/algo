package org.serjmaks.algo.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @ParameterizedTest
    @MethodSource("arguments")
    //TODO: add test
    void run(int[] nums, List<List<Integer>> expected) {
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(),
                Arguments.of()
        );
    }
}
