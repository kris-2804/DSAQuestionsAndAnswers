import java.util.Arrays;

public class CanConvertStringInKMoves {
    public static void main(String[] args) {

        System.out.println(canConvertString("aab", "bbb", 27));
    }

    public static boolean canConvertString(String s, String t, int k) {

        boolean answer = true;

        int[] differenceArray = new int[s.length()];
        int maxcountArray[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            differenceArray[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        for(int i = 0; i<maxcountArray.length ; i++){
            maxcountArray[i] = ((k-i)/26)+1;
        }


         System.out.println(Arrays.toString(maxcountArray));


        Arrays.sort(differenceArray);



        for (int i = 0; i < differenceArray.length; i++) {

            if((i != differenceArray.length - 1 && differenceArray[i] == differenceArray[i + 1])){
                int counter  = 1;
                for(int j = i ; j<differenceArray.length ; j++){
                    if(differenceArray[i+1]==differenceArray[i]){
                        counter++;
                    }
                }

                if(counter>maxcountArray[differenceArray[i]-1]){
                    return false;
                }
            }
            if ( differenceArray[i] > k) {
                return false;
            }
        }
        return answer;

    }
}
