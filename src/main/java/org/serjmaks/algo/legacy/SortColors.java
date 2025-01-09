package org.serjmaks.algo.legacy;

public class SortColors {
    public static void run(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int index = 0;

        while (index <= end && start < end) {
            if (nums[index] == 0) {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
            } else if (nums[index] == 1) {
                index++;
            } else { // nums[index] == 2
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }
        }
    }
}
