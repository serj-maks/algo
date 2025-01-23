package org.serjmaks.algo.maximum_product_subarray;

public class MaximumProductSubarray {
    public static int run(int[] nums) {
        int size = nums.length;
        int left = 1;
        int right = 1;
        int result = nums[0];

        for (int i = 0; i < size; i++) {
            if (left == 0) {
                left = 1;
            }
            if (right == 0) {
                right = 1;
            }

            left *= nums[i];
            right *= nums[size - 1 - i];

            result = Math.max(result, Math.max(left, right));
        }

        return result;
    }
}
