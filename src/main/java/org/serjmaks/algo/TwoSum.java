package org.serjmaks.algo;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // возвращает номера элементов массива
    public int[] run(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentElementNumber = nums[i];
            int x = target - currentElementNumber;
            if (map.containsKey(x)) {
                return new int[] {map.get(x), i};
            }
            map.put(currentElementNumber, i);
        }
        return new int[0];
    }
}
