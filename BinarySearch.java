public class BinarySearch {
    public static void main(String[] args) {

    }

    static  int binarySearch(int arr[] , int target){
        int start = 0 ;
        int end = arr.length-1;


        while (start<=end){
            int mid = (start+end)/2;
             if(target>mid){
                 start = mid+1;
             }else  if(target<mid){
                 end = target-1;

             }
             else {
                 return mid;
             }
        }


        return  -1;
    }
}
