public class Question {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12,345,2,6,-7896}));
    }


    public  static  int noOfDigit(int number ){

        return (int)  (Math.log10(number)+1);

    }

    public  static  int findNumbers(int[] nums){
        int count =0;
        for(int i=0 ; i< nums.length; i++){
            if((noOfDigit(nums[i])&1)==0){
                count++;
            }
        }
        return count;
    }



}
