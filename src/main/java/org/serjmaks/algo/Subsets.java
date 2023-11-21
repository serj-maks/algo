package org.serjmaks.algo;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> run(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<Integer>(), result);
        return result;
    }

    private static void generateSubsets(int index,
                                        int[] nums,
                                        ArrayList<Integer> currentList,
                                        List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(currentList));
        for (int i = index; i < nums.length; i++) {
            currentList.add(nums[i]);
            generateSubsets(i + 1, nums, currentList, subsets);
            currentList.remove(currentList.size() - 1);
        }
    }
}
