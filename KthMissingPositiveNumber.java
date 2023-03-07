import java.util.Arrays;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2,3,4,7,11} , 5));
    }


    public static int findKthPositive(int[] arr, int k) {
        int count  = 1;
        for(int i = 0 ; i< arr.length ; ){

            if(count!=arr[i]){
                k--;
            }
            if(k==0){
                return count;
            }

            if(count>=arr[i]){
                i++;
            }

            if(i< arr.length)count++;
        }



        return arr[arr.length-1] == arr.length ? arr[arr.length-1]+k : count+k;
    }
}
