public class nextGreatestLetter {

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'a'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
          int start = 0;
          int end = letters.length -1;

          if(letters[letters.length-1]<=target){
              return letters[0];
          }
          while (start<=end){
              int mid = start+(end-start)/2;
               if(letters[mid]>target){
                  end = mid-1;
              } else {
                  start = mid+1;
              }


          }


          return letters[start];
    }
}
