package org.serjmaks.algo.contains_duplicate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @ParameterizedTest
    @MethodSource("arguments")
    public void run(int[] nums, boolean expected) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean actual = containsDuplicate.run(nums);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> arguments () {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,1}, true),
                Arguments.of(new int[]{0}, false),
                Arguments.of(new int[]{2,4,6,8}, false)
        );
    }
}
