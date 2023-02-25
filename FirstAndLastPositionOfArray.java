import java.util.Arrays;

public class FirstAndLastPositionOfArray {
    public static void main(String[] args) {
        int[] arr = searchRange(new int[]{5, 7, 7, 8, 8, 10}, 7);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];






 res[0] = search(nums , target, true);
 if(res[0]!=-1){
     res[1] = search(nums , target,false );
 }







        return res;
    }

public  static  int search(int[]nums , int target , boolean isFirstOccurence){
    int start = 0;
    int end = nums.length - 1;
    int ans =-1;
    while (start <= end) {
        int mid = start + (end - start) / 2;


        if (nums[mid] > target) {
            end = mid - 1;
        } else if (nums[mid] < target) {
            start = mid + 1;
        } else if (target == nums[mid]) {

ans = mid;
            if(isFirstOccurence){
                end = mid - 1;
            } else {
                start = mid+1;
            }


        }



    }




return  ans;

}

}