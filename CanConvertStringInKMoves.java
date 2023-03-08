import java.util.Arrays;

public class CanConvertStringInKMoves {
    public static void main(String[] args) {

        System.out.println(canConvertString("iqssxdlb", "dyuqrwyr", 40));
    }

    public static boolean canConvertString(String s, String t, int k) {

        boolean answer = true;
        if(s.length()!=t.length()) return false;

        int[] differenceArray = new int[s.length()];
        int[] maxcountArray = new int[27];
        for (int i = 0; i < s.length(); i++) {
            differenceArray[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        for(int i = 1; i<maxcountArray.length ; i++){
            maxcountArray[i] = ((k-i)/26)+1;
        }





        Arrays.sort(differenceArray);

        System.out.println(Arrays.toString(differenceArray));
        System.out.println(Arrays.toString(maxcountArray));

        for (int i = 0; i < differenceArray.length; i++) {

            if((i != differenceArray.length - 1 && differenceArray[i] == differenceArray[i + 1] &&differenceArray[i]!=0 )){
                int counter  = 0;
                for(int j = i ; j<differenceArray.length ; j++){
                    if(differenceArray[i+1]==differenceArray[i]){
                        counter++;
                    }
                }

                if(counter>maxcountArray[differenceArray[i]]){
                    System.out.println("return");
                    return false;
                }
            }
            if ( differenceArray[i] > k) {
                System.out.println("return2");
                return false;
            }
        }
        return answer;

    }
}
