public class Trap {
    public static void main(String[] args) {

        System.out.println(trap(new int[]{4,2,3}));
    }

    public static int trap(int[] height) {
        int count = 0;
        if(height.length<=2) return  0;
      int []maxLeftArray = new int[height.length];
      int [] maxRightArray = new int[height.length];


      maxLeftArray[0] = height[0];
      maxRightArray[height.length-1] = height[height.length-1];


      for(int i = height.length-2; i>=0 ; i--) {

          maxRightArray[i]= Math.max(maxRightArray[i+1] , height[i]);


      }


      for( int i = 1; i<height.length ; i++){
          maxLeftArray[i] = Math.max(maxLeftArray[i-1] , height[i]);

      }



       for(int i = 0 ; i< height.length ; i++){

           count+= Math.max((Math.min(maxLeftArray[i], maxRightArray[i]) - height[i]), 0);

         }

        return count;

       }




    }




