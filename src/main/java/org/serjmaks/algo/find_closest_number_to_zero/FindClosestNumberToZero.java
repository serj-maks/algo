package org.serjmaks.algo.find_closest_number_to_zero;

public class FindClosestNumberToZero {
    public static int run(int[] nums) {
        int result = Integer.MAX_VALUE;

        for (int i : nums) {
            if (Math.abs(i) < Math.abs(result) || i == Math.abs(result)) {
                result = i;
            }
        }

        return result;
    }
}
