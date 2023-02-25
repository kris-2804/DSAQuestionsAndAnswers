public class BS {
    public static void main(String[] args) {
        int[] arr = new int[]{14,13,12,11,10,9,8,7,6,5,4,3,2,1};

        int startIndex = 0;
        int endIndex = arr.length-1;
        int target = 3;

        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;

            if (arr[mid] == target)   {

            }else if (arr[mid] > target) {
                startIndex = mid + 1;
            }else if (arr[mid] < target) {
                endIndex = mid -1;
            }
        }


    }



}

