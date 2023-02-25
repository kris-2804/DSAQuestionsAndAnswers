public class CelingOfANumber {
    public static void main(String[] args) {
        System.out.println(findCeiling(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17}, 14));
    }

    public  static  int findCeiling(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(arr[end]<target){
            return -1;

        }
        while (start<=end){

            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }else  if(target>arr[mid]){

                start = mid+1;
            }else {

                end = mid-1;

            }






        }

        return  arr[start];

    }
}
