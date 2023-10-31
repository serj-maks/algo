package org.serjmaks.algo;

public class ProductOfArrayExceptSelf {

    public static int[] run(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        int r = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * r;
            r = r * nums[i];
        }
        return result;
    }
}
