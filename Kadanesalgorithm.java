public class Kadanesalgorithm {

    public static void main(String[] args) {
        int [] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxTillNow  = Integer.MIN_VALUE;
        int s  = 0;
        int e  = 0;
        int max = 0;
        int start  = 0;


        for(int i = 0 ; i< arr.length ; i++){
            maxTillNow += arr[i];


            if(maxTillNow<max){
                maxTillNow = max ;
                start = s;
                e =  i;

            }

            if(max<0){
                max =0;
                s = i+1;

            }
        }


        System.out.println(maxTillNow+"     "+ s+ "      "+e+"    ");
    }
}
