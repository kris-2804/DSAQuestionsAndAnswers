import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{0,1,1,2,2}));
    }


    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int counter  = 1;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i]<=0) continue;
        if(nums[i]==counter){
            ++counter;
        }mgjkfj{
            return  counter;

        }
        }


        return counter;
    }
}
