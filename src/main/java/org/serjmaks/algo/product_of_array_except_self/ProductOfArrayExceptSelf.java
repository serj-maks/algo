package org.serjmaks.algo.product_of_array_except_self;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] run(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        Arrays.fill(result, 1);

        int multiplicator = 1;
        for (int i = 0; i < size; i++) {
            result[i] *= multiplicator;
            multiplicator *= nums[i];
        }

        multiplicator = 1;
        for (int j = size - 1; j >= 0; j--) {
            result[j] *= multiplicator;
            multiplicator *= nums[j];
        }

        return result;
    }
}
