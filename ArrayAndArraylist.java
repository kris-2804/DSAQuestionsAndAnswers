import java.util.*;

public class ArrayAndArraylist {
    public static void main(String[] args) {

  int [] arr = {2,23,3231,3,42,12523,121,11,232,2323};
  int target = 11;
  int arr2[][] = {
            {
              12,23,34,42,643,123
            },
          {
              14,15,16,17,8,123,1312
          }
        };
        System.out.println(Arrays.toString(searchIn2DArray(arr2, 8)));


      System.out.println(maxIn2DArray(arr2));

    }
    static  int linearSearch(int[]arr , int target){
        if(arr.length==0)return -1;
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i]==target)return i;
        }



        return -1;
    }


    static  int[] searchIn2DArray(int[][]arr, int target){


        for(int i = 0 ; i<arr.length;i++){
            for(int j =0 ; j< arr[i].length ; j++){
                if(arr[i][j]==target){

                  return  new int[]{i,j};
                }

            }
        }


        return  new int[]{-1,-1};
    }

    static  int maxIn2DArray(int[][]arr){

   int max = arr[0][0];
        for(int i = 0 ; i<arr.length;i++){
            for(int j =0 ; j< arr[i].length ; j++){
                max = Math.max(arr[i][j] , max);



                }

            }

        return max;


    }




}
