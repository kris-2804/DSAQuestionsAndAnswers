import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        //[[1,11],[2,12],[3,13],[4,14],[5,15],[6,16],[7,17],[8,18],[9,19],[10,20]]
        int[][] matrix = {
                {1, 11},
                {2, 12},
                {3, 13},
                {4, 14},
                {5, 15},
                {6, 16},
                {7, 17},
                {8, 18},
                {9, 19},
                {10, 20}


        };
        System.out.println(spiralOrder(matrix));


    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();


        int rows = matrix.length;
        int columns = matrix[0].length;

        int layers = rows / 2 + 1;
        if (columns < 3) {

            layers = 2;

        }


        if (matrix.length == 1) {
            for (int i = 0; i < matrix[0].length; i++) {


                list.add(matrix[0][i]);

            }
            return list;
        } else if (matrix[0].length == 1) {
            for (int i = 0; i < rows; i++) {
                list.add(matrix[i][0]);

            }
            return list;
        }

        for (int i = 0; i < layers; i++) {

            for (int j = i; j < columns - i; j++) {
                list.add(matrix[i][j]);

            }

            if (i != layers - 1) {

                for (int k = i + 1; k <= (rows - 1) - (i + 1); k++) {
                    list.add(matrix[k][(columns - 1) - i]);
                }


                for (int l = (columns - 1) - i; l >= i; l--) {


                    list.add(matrix[(rows - 1) - i][l]);
                }


                for (int m = (rows - 1) - (i + 1); m >= i + 1; m--) {
                    list.add(matrix[m][i]);

                }
            }


        }

        if (list.size() > rows * columns) {
            for (int i = list.size(); i > rows * columns; i--) {
                list.remove(i - 1);
            }
        }

        return list;

    }


}

