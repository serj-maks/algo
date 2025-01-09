package org.serjmaks.algo.legacy;

import java.util.ArrayDeque;
import java.util.Queue;

public class Matrix01 {

    public static int[][] run(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (mat[i][j] == 0) {
                    queue.add(new int[]{i, j});
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = row + direction[1];

                if (newRow >= 0 &&
                        newRow < rows &&
                        newCol >= 0 &&
                        newCol < cols &&
                        mat[newRow][newCol] > mat[row][col] + 1) {
                    mat[newRow][newCol] = mat[col][row] + 1;
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }

        return mat;
    }
}
