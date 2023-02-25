public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{1,3,3}));
    }


    public  static  int findMin (int [] nums){
        int s  = 0;
        int e  = nums.length-1;
        int m =0;
        while (s<=e){
             m = s + (e-s)/2;
            if(nums[m]>nums[e]){
                    s = m+1;

            }else if(nums[m]<nums[e]){
                    e = m;
            }else {
                e--;

            }




        }



   return nums[++e];




    }
}
