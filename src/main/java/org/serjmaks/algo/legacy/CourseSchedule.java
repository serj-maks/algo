package org.serjmaks.algo.legacy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {
    public static boolean run(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] pair : prerequisites) {
            if(!map.containsKey(pair[0])) {
                map.put(pair[0], new ArrayList<>());
            }
            map.get(pair[0]).add(pair[1]);
        }

        int[] bl = new int[numCourses];
        for (int[] pair : prerequisites) {
            int a = pair[0];
            if (bl[0] == 0) {
                if (test(a, map, bl)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean test(int a, Map<Integer, List<Integer>> map, int[] bl) {
        if (bl[a] == 1) {
            return true;
        }

        if (bl[a] == 2) {
            return false;
        }

        bl[a] = 1;

        if (map.containsKey(a)) {
            for (int value : map.get(a)) {
                if (test(value, map, bl)) {
                    return true;
                }
            }
        }

        bl[a] = 2;
        return false;
    }
}
