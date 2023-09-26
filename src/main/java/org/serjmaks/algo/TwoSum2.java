package org.serjmaks.algo;

import java.util.HashSet;
import java.util.Set;

public class TwoSum2 {
    // возвращает элементы массива
    public static int[] run(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int x = target - current;
            if (set.contains(x)) {
                return new int[] {x, current};
            }
            set.add(current);
        }
        return new int[0];
    }
}
