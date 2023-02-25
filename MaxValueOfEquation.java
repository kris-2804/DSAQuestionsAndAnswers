import  java.lang.*;


public class MaxValueOfEquation {
    public static void main(String[] args) {


//        [[-19,9],[-15,-19],[-5,-8]]
     int [][] arr = {


             {-19,9},
             {-15,-19},
             {-5,-8}

     };
        System.out.println(findMaxValueOfEquation(arr , 10  ));
    }

    public static  int findMaxValueOfEquation(int[][] points, int k) {
        int maxval = Integer.MIN_VALUE  ;

           for(int i =0 ; i< points.length; i++){


                for(int j  = i ; j<points.length ; j++){
                   if(Math.abs((points[i][0]-points[j][0]))<=k&&i!=j){


                       int currentval = points[j][1]+points[i][1]+Math.abs(points[i][0]-points[j][0]);



                       maxval = Math.max(currentval , maxval);

                   }
                }

           }


           return maxval;
    }
}
