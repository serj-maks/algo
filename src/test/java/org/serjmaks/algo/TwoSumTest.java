package org.serjmaks.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {

    @Test
    //TODO: create parametrized test here
    public void run() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {1,2,4,5,6};
        int target = 10;

        int[] expected = {2,4};
        int[] actual = twoSum.run(nums, target);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
