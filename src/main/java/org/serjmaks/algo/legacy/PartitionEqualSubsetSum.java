package org.serjmaks.algo.legacy;

public class PartitionEqualSubsetSum {

    static Boolean mem[][];

    public static boolean run(int[] nums) {
        int sum = 0;
        int n = nums.length;

        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false;
        }

        sum /= 2;
        mem = new Boolean[n+1][sum+1];

        return subsetSum(nums, 0, sum);
    }

    private static boolean subsetSum(int[] nums, int pos, int sum) {
        if (sum == 0) {
            return true;
        } else if (pos >= nums.length || sum < 0) {
            return false;
        }

        if (mem[pos][sum] != null) {
            return mem[pos][sum];
        }

        return mem[pos][sum] = subsetSum(nums, pos + 1, sum - nums[pos]) ||
                               subsetSum(nums, pos + 1, sum);
    }
}
