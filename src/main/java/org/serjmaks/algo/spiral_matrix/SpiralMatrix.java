package org.serjmaks.algo.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> run(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }

        int rowMin = 0;
        int rowMax = matrix.length-1;
        int colMin = 0;
        int colMax = matrix[0].length-1;

        while(rowMin <= rowMax && colMin <= colMax) {
            for(int i=colMin; i<=colMax; i++) {
                list.add(matrix[rowMin][i]);
            }
            rowMin++;

            for(int i=rowMin; i<=rowMax; i++) {
                list.add(matrix[i][colMax]);
            }
            colMax--;

            if(rowMin > rowMax || colMin > colMax) {
                break;
            }

            for(int i=colMax; i>=colMin; i--) {
                list.add(matrix[rowMax][i]);
            }
            rowMax--;

            for(int i=rowMax; i>=rowMin; i--) {
                list.add(matrix[i][colMin]);
            }
            colMin++;
        }

        return list;
    }
}
