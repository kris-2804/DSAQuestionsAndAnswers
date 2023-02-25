
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      int n = sc.nextInt();
      int c = 2;

      while (c*c<=n){
          if(n%c==0){

              System.out.println(false);
              break;
          }

          c++;
}

        System.out.println(true);


    }
}
