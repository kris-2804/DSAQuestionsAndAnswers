import java.util.ArrayList;
import java.util.List;

public class SetMatrixToZero {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        setZeros(matrix);
        for (int[] arr : matrix) {
            for (int i : arr) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void setZeros(int[][] matrix) {


        int rows = matrix.length;
        int columns = matrix[0].length;
        List<Integer> rowlist= new ArrayList<>();
        List<Integer> columnlist =new ArrayList<>();

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                if (matrix[i][j] == 0) {
                    rowlist.add(i);
                    columnlist.add(j);

                }


            }
        }


        for(int i = 0 ; i<rows; i++){
            for(int j = 0 ; j< columns; j++){
                if (rowlist.contains(i))matrix[i] = new int[columns];

            }
        }
        for(int i = 0 ; i<rows; i++){
            for(int j = 0 ; j< columns; j++){
               if(columnlist.contains(j)) matrix[i][j] = 0;

            }
        }




    }
}
