public class SpiralMatrixTwo {
    public static void main(String[] args) {
  int [][] arr = generateMatrix(2);
  for(int[]i : arr){
      for(int j : i){
          System.out.println(j);
      }
  }
    }


    public static  int[][] generateMatrix(int n) {

        if(n==1){
            return  new int[][]{{1}};
        }
      int matrix [] [] = new int[n][n];

      int counter = 1 ;
      int layers = n/2+1;


      for(int  i = 0 ; i< layers ;i++){
          for (int j = i; j < n - i; j++) {
              matrix[i][j] = counter;
              counter++;

          }


          if (i != layers - 1) {

              for (int k = i + 1; k <= (n - 1) - (i + 1); k++) {

                  matrix[k][(n-1)-i] = counter;
                  counter++;
              }


              for (int l = (n - 1) - i; l >= i; l--) {


                  matrix[(n - 1) - i][l] = counter;
                  counter++;
              }


              for (int m = (n - 1) - (i + 1); m >= i + 1; m--) {
                  matrix[m][i] = counter;
                  counter++;


              }
          }


      }
        return  matrix;
      }



    }

