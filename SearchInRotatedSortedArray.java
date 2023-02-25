public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));

    }

   public  static  int search(int [] arr  , int target){
        int start = 0 ;
        int end = arr.length -1;


        while (start<=end){
            int mid = (int)Math.floor((start+end)/2);
            if(arr[mid]==target) return  mid;
            else if(target<mid){
                if(arr[start]>=target&&arr[mid]<=target){
                    end = mid;


                } else  {
                    start = mid;
                }
            }else  if(target>mid){
                if(arr[start]>= target&&arr[mid]>=target&&arr[end]<=target){
                    start = mid;
                }else {
                    end = mid;
                }
            }



        }

       return  -1;
   }
}
