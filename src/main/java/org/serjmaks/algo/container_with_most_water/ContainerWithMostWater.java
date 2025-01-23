package org.serjmaks.algo.container_with_most_water;

public class ContainerWithMostWater {
    public static int run(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int max = 0;

        while (left < right) {
            int width = right - left;
            int height = Math.min(nums[left], nums[right]);
            int volume = width * height;
            max = Math.max(max, volume);

            if (nums[left] < nums[right]) {
                left++;
            } else if (nums[left] > nums[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return max;
    }
}
