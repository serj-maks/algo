package org.serjmaks.algo;

import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointsToOrigin {
    public static int[][] run(int[][] points, int k) {
        Queue<int[]> pq = new PriorityQueue<>(k, (a, b) -> Integer.compare(dist(a), dist(b)));

        for (int[] p : points) {
            pq.add(p);
        }

        int[][] result = new int[k][2];

        while (!pq.isEmpty() && k > 0) {
            result[--k] = pq.remove();
        }

        return result;
    }

    private static int dist(int[] point) {
        return ((point[0] * point[0]) +(point[1] + point[1]));
    }
}
