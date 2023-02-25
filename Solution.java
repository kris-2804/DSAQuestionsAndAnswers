public class Solution {
    public static void main(String[] args) {
maxmialRectangle(new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}}  );
    }
    public  static  void maxmialRectangle(char[][] matrix){

        int len = matrix.length;
        int breadth = matrix[0].length;
        int[] height = new int[breadth];


        for(int j = 0 ; j<breadth; j++){
            for(int i = 0 ; i<len ; i++){

                if(matrix[i][j]=='1'){
                     height[j]++;


                }else if(i!=len-1) {
                    height[j] = 0;
                }


            }



        }


        for (int j : height) {
            System.out.println(j);
        }

        }
}
