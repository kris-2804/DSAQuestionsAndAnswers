public  class findInMountainArray  {

static int counter =0;
    public static void main(String[] args) {
        int [] arr2  = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82};
        int[] arr3 = new int[]{3,5,3,2,0};
        
      System.out.println(findInMountainArray(3, arr3));
        System.out.println(counter);
    }
   public static int findInMountainArray(int target , int[]arr){
       int start = 0;
       int end = arr.length-1;
       int mid = findPeakIndex(arr);

       int ans = search(start,mid ,arr,target);
       if(ans==-1){
       ans =    search(mid, end,arr,target);
       }

       return ans;

   }

   public static   int findPeakIndex (int[]arr){
       int start = 0 ;
       int end = arr.length -1;

       if(arr.length<3){
           return  -1;

       }
       while (start<=end&&counter<100){
           counter+=2;
           int mid = start+(end-start)/2;

           if(mid!=arr.length-1&&arr[mid+1]>arr[mid]){
               start = mid+1;
           }else if(mid>=1&&arr[mid-1]>arr[mid]){
               end = mid-1;
           }else  return  mid;



       }

       return   -1;

   }


   public static int search(int startIndex , int endIndex , int[]arr , int target ){
        counter+=2;
       if(arr[startIndex]<arr[endIndex]&&counter<100){
           while (startIndex<=endIndex&&counter<100){
               counter++;
               int mid  = startIndex+(endIndex-startIndex)/2;
               if(arr[mid]>target){
                   endIndex = mid-1;
               }else if(arr[mid]<target){
                   startIndex =mid+1;
               }else if(arr[mid]==target){
                   return mid;
               }

           }
       } else if(arr[startIndex]>arr[endIndex]){
           while (startIndex<=endIndex){
               int mid  = startIndex+(endIndex-startIndex)/2;
               if(arr[mid]>target){
                   startIndex = mid+1;

               }else if(arr[mid]<target){
                   endIndex = mid-1;
               }else if(arr[mid]==target){
                   return mid;
               }
           }
       }
   return -1;
   }
}