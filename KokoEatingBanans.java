import java.util.Arrays;

public class KokoEatingBanans {
    public static void main(String[] args) {
        System.out.println(minEatingSPeed(new int[]{312884470} ,312884469));
    }


 public  static  int minEatingSPeed(int []arr , int h){
Arrays.sort(arr);
int start  = 1;
int end = arr[arr.length-1];
int mid =0;
int k = end;

while (start<=end) {

mid = start + (end - start) / 2;
if(canEatAllTheBanans(arr , mid , h)){
    end = mid-1;
    k = mid;

          }else  {
             start = mid+1;
          }


        }


        return  k;

        }




        public  static  boolean canEatAllTheBanans(int[]arr , int speed , int hours){
        int counter  = 0;

         for(int i = 0; i<arr.length && hours>=0 ; i++){
             if(arr[i]<speed){
                 hours--;
                 counter++;
             } else if(arr[i]%speed==0){
                 hours -= arr[i]/speed;
                 counter++;
             } else  {
                 hours-=(arr[i]/speed)+1;
                 counter++;
             }
         }


         return  counter==arr.length&&hours>=0;
         }

        }



