import java.util.Arrays;
import java.util.Scanner;

public  class ReplaceElementByRank  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr  = new int[n];
        int [] locations = new int[1000];
        int [] answers  = new int[n];



        for(int  i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
            locations[arr[i]] = i;

        }

        Arrays.sort(arr);


        int counter = 1;
        for(int  i = 0 ; i< n ; i++){
            answers[locations[arr[i]]] = counter;
            counter++;

        }


        for(int i : answers){
            System.out.println(i);
        }

    }


}
