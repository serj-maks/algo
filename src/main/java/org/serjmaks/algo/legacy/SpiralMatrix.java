package org.serjmaks.algo.legacy;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> run(int[][] matrix) {
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;
        int size = matrix.length * matrix[0].length;
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return result;
        }

        while (result.size() < size) {
            for (int i = left; i <= right && result.size() < size; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom && result.size() < size; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            for (int i = right; i >= left && result.size() < size; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top && result.size() < size; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }

        return result;
    }
}
