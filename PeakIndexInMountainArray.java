public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,2,1,0}));
    }

    public  static  int peakIndexInMountainArray(int[] arr){
        int start = 0 ;
        int end = arr.length -1;

        if(arr.length<3){
            return  -1;

        }
        while (start<=end){
            int mid = start+(end-start)/2;

            if(mid!=arr.length-1&&arr[mid+1]>arr[mid]){
                start = mid+1;
            }else if(mid>=1&&arr[mid-1]>arr[mid]){
            end = mid-1;
            }else  return  mid;



        }

        return   -1;

    }
}
