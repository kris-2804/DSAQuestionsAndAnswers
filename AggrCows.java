
import java.util.Arrays;
import java.util.Scanner;

public class AggrCows {
    public  static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();

       solve(T);
    }


    public static  int solve(int T){
        int ans = 0;


//         int n = sc.nextInt();
//         int c = sc.nextInt();
//         int [] arr = new int[n];
//         int [] pos  = new int[n+1];


        int [] arr = new int[]{1,2,8,4,9};

//         for(int i = 0; i< arr.length ; i++){
//             arr[i] = sc.nextInt();
//         }


            Arrays.sort(arr);


        System.out.println(canPlaceCows(arr , 3,4));




        return  ans ;
    }
//[1,2,4,8,9]

    public  static  boolean canPlaceCows(int[]arr, int noOfcows ,int distance ){
                    int current =1;
                    for(int i = 0 ; i< arr.length ; i++){
                        if(arr[i]-current > distance){
                            continue;
                        }
                        if(--noOfcows==0){
                            current = arr[i];
                            return true;
                        }
                    }

                    return  false;
    }


}
