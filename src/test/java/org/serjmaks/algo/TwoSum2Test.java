package org.serjmaks.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum2Test {
    @Test
    //TODO: create parametrized test here
    public void run() {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] nums = {1,2,4,5,6};
        int target = 11;

        int[] expected = {5,6};
        int[] actual = twoSum2.run(nums, target);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

}