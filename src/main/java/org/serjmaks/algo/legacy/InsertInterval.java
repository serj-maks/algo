package org.serjmaks.algo.legacy;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public static int[][] run(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            if (newInterval[1] < interval[0]) {
                result.add(newInterval);
                newInterval = interval;
            } else if (interval[1] < newInterval[0]) {
                result.add(interval);
            } else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                interval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }
}
