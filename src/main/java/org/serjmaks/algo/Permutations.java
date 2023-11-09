package org.serjmaks.algo;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> run(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();

        if (nums.length == 0) {
            return permutations;
        }

        dfs(nums, 0, new ArrayList<>(), permutations);
        return permutations;
    }

    // collect permutations
    private static void dfs(int[] nums, int start, List<Integer> permutation, List<List<Integer>> permutations) {

        if (permutation.size() == nums.length) {
            permutations.add(permutation);
            return;
        }

        for (int i = 0; i <= permutation.size(); i++) {
            List<Integer> newPermutation = new ArrayList<>(permutation);
            newPermutation.add(i, nums[start]);
            dfs(nums, start + 1, newPermutation, permutations);
        }
    }
}
