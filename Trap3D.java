public class Trap3D {
    public static void main(String[] args) {
//        [12,13,1,12],[13,4,13,12],[13,8,10,12],[12,13,12,12],[13,13,13,13]
        System.out.println(trapRainWater(new int[][]{
                {12,13,1,12},
                {13,4,13,12},
                {13,8,10,12},
                {12,13,12,12},
                {13,13,13,13}

        }));
    }

    public static  int trapRainWater(int[][] height) {
          int count  = 0;

        if(height.length<=2) return  0;
      int [][] maxLeftArray= new int[height.length][height[0].length];
      int [][] maxRightArray= new int[height.length][height[0].length];
      int [][] maxTopArray= new int[height.length][height[0].length];
      int [][] maxBottomtArray= new int[height.length][height[0].length];



        for(int i = 0 ; i<height.length; i++){
            maxLeftArray[i][0] = height[i][0];
            maxRightArray[i][height[0].length-1] = height[i][height[0].length-1];
        }
        for(int i = 0 ; i< height[0].length; i++){
            maxTopArray[0][i] = height[0][i];
            maxBottomtArray[height.length-1][i] = height[height.length-1][i];

        }

        for(int i = 0; i<height.length ; i++){
            for(int j = 1 ; j< height[0].length ; j++){
                maxLeftArray[i][j] = Math.max(maxLeftArray[i][j-1], height[i][j]);

            }
        }

        for(int i = 0; i<height.length ; i++){
            for(int j =height[0].length-2 ; j>0 ; j--){
                   maxRightArray[i][j] = Math.max(maxRightArray[i][j+1] , height[i][j]);
            }
        }

        for(int i = 1 ; i<height.length ; i++){
            for(int j = 0 ; j<height[0].length ; j++) {

                maxTopArray[i][j] = Math.max(maxTopArray[i-1][j] , height[i][j]);
            }
        }


        for(int i =height.length-2 ; i>0 ; i--){
            for(int j = 0 ; j<height[0].length ; j++){
                maxBottomtArray[i][j] = Math.max(maxBottomtArray[i+1][j] , height[i][j]);

            }
        }




        for(int i = 0 ; i<height.length ; i++){
            for(int j = 0 ; j< height[0].length ; j++){
                if(i==0||j==0||i==height.length-1||j==height[0].length-1) continue;


                count+=(Math.min(Math.min(maxTopArray[i][j] , maxBottomtArray[i][j]) , Math.min(maxLeftArray[i][j] , maxRightArray[i][j])) - height[i][j]);
            }
        }


          return  count;
    }
}
