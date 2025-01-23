package org.serjmaks.algo.contains_duplicate;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean run(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int dummy = 0;

        for (int i = 0; i < nums.length; i++) {
            dummy = nums[i];
            if (map.containsKey(dummy)) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
