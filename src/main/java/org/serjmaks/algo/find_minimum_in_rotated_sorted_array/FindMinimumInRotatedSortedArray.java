package org.serjmaks.algo.find_minimum_in_rotated_sorted_array;

public class FindMinimumInRotatedSortedArray {
    public static int run(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid+1;
            }
        }

        return nums[left];
    }
}
