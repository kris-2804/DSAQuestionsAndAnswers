public class InfiniteSortedArray {
    public static void main(String[] args) {
        System.out.println(findAnswer(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24}, 17));
    }


    public static  int binarySearch (int[] arr , int target , int start , int end){
        int ans = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                ans = mid;
                return  ans;
            }else if(target>arr[mid]){
                start =mid+1;
            }else {
                end = mid-1;
            }
        }

        return ans;



    }

    public static int findAnswer(int[] arr , int target){
       int start = 0;
       int end = 1;
       int ans;
       while (true){
           ans = binarySearch(arr , target , start , end);
           if(ans!=-1){
               return ans;
           }
           int temp = start;
           start = end+1;

           end = start+(2*end-temp);


       }

    }
}
