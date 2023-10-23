package org.serjmaks.algo.two_pointers;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> run(int[] nums) {

        int target = 0;
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == target) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }

            }
        }

        result.addAll(set);
        return result;
    }
}
