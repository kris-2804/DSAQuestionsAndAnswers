import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NRopesWithMinimalCost {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(5, 4, 2, 8);
        System.out.println(connetNropes(prices));
    }

    public  static  int connetNropes(List <Integer> ropes){
        int cost  = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(ropes);




          while (priorityQueue.size()>1){

          int x  = priorityQueue.poll();
          int y  = priorityQueue.poll();


          int sum = x+y ;



          priorityQueue.add(sum);
          cost+=sum;

          }

        return cost;
    }

}
