public class SearchIn2DArrays {
    public static void main(String[] args) {
        
    }

    public  static  boolean search(int [][]arr , int target){

        int start [] = new int[2];

        int end [] = new int[]{arr.length-1, arr[0].length-1};
        int mid  [] = new int[2];


        while (start[0]<=end[0]){

       mid [0] = start[0]+(end[0]-start[0])/2;
       mid[1] = start[1]+(end[1]-start[1])/2;


       if(arr[mid[0]][mid[1]]>target){
           if(arr[mid[0]][arr[0].length-1]>target){


           }
       }


        }




        return false;
    }
}
