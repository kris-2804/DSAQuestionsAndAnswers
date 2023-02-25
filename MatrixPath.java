import java.util.Arrays;

public class MatrixPath {
    public static int maxSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];

        // initialize the first row of dp array
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }

        // fill in the rest of the dp array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE, center = dp[i-1][j];
                if (j-1 >= 0) {
                    left = dp[i-1][j-1];
                }
                if (j+1 < m) {
                    right = dp[i-1][j+1];
                }
                dp[i][j] = matrix[i][j] + Math.max(left, Math.max(center, right));
            }
        }

        // find the maximum sum in the last row of dp array
        int maxSum = Integer.MIN_VALUE;
        for (int j = 0; j < m; j++) {
            maxSum = Math.max(maxSum, dp[n-1][j]);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        int maxSum = maxSum(matrix);
        System.out.println("The maximum sum is: " + maxSum);
    }
}
