import java.util.Arrays;

public class MinumumTime {
    public static void main(String[] args) {
        System.out.println(miniTime(new int[]{5,10,10} , 9));
    }


    public static  long miniTime(int [] time  , int totalTrips ){
        if(time.length==1)return (long) time[0]*totalTrips;
        Arrays.sort(time);

        int trips  = 0;
        int start= time[0];
        int end  = 25;

  int mid  = start+(end-start)/2;
  while (start<end){
     mid  = start+(end-start)/2;
      trips =0;

      for(int i = 0 ; i< time.length ; i++){
          if(mid>=time[i]){
              trips+=mid/time[i];

          }
          if(trips==totalTrips){
            end = mid;
              trips =0;
              break;
          }

          if(mid<time[i]&&trips!=totalTrips){
              i= 0;
             start = mid+1;
              trips =0;
              break;
          }
      }

      if(trips>=totalTrips){
         end = mid;
      } else  if(trips<=totalTrips){
          start = mid;
      }




  }



        return  (long)start;

    }
}
