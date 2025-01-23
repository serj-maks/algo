package org.serjmaks.algo.maximum_subarray;

public class MaximumSubarray {

    public static int run(int[] nums) {
        int current = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            max = Math.max(current, max);
        }

        return max;
    }
}
