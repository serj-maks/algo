package org.serjmaks.algo.legacy;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> run(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        
        find(0, target, candidates, currentSubset, result);
        return result;
    }

    private static void find(int index, int target, int[] candidates, List<Integer> currentSubset, List<List<Integer>> result) {
        // checks if we have explored all the elements of array
        if (index == candidates.length) {
            if (target == 0) {
                result.add(new ArrayList<>(currentSubset));
            }
            return;
        }

        if (candidates[index] <= target) {
            currentSubset.add(candidates[index]);

            // after adding the element of curr index, iterate the left path until the base condition is met
            find(index, target - candidates[index], candidates, currentSubset, result);
            currentSubset.remove(currentSubset.size() - 1);
        }

        // this is required because when the above recursion call
        // is executed then the Data structure still has curr index element
        // so we need to remove it
        find(index + 1, target, candidates, currentSubset, result);
    }
}
