import java.util.Arrays;
import java.util.Scanner;

public class MatrixPath2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][]  arr = new int[][]{
                {1,2,3},
                {4,5,6,},
                {7,8,9}
        };//new int[n][m];
        int [][] dp = new int[n][m];

//        for(int i = 0 ; i< n ; i++){
//            for(int j = 0 ; j< m ; j++){
//                arr[i][j] =sc.nextInt();
//            }
//        }

        for(int i =0 ; i<m ; i++){
            dp[0][i] = arr[0][i];
        }


        for(int i = 1;i< n;i++){
            for(int j = 0 ; j< m ; j++){


                int center = dp[i-1][j];
                int left= Integer.MIN_VALUE , right = Integer.MIN_VALUE;
                if(j-1>0){
                    left = dp[i-1][j-1];
                }

                if(j+1<m){
                    right = dp[i-1][j+1];
                }

                dp[i][j] = arr[i][j]+ Math.max(Math.max(right , left) , center);



            }
        }


        for(int[] a :dp){
            System.out.println(Arrays.toString(a));
        }
    }
}
