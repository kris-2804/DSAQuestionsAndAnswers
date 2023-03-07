public class CountSubArraysWithFixedBounds {
    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[]{1,3,5,2,7,5} , 1,5));
    }
    public static long countSubarrays(int[] nums, int minK, int maxK) {
      int count  = 0;
      for(int i= 0 ; i< nums.length ; i++){
          int maxnow = Integer.MIN_VALUE;
          int minnow  = Integer.MAX_VALUE;
          for(int j = i ; j<nums.length ; j++){

              maxnow = Math.max(maxnow , nums[j]);
              minnow = Math.min(minnow , nums[j]);

             if(maxnow==maxK&&minnow==minK){
                 count++;
             }
          }
      }



      return count;
    }
}
