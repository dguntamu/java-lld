package java8;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueEg {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (a<b) ? -1 : (a>b) ? 1 : 0);
        pq.add(5);
        pq.add(2);
        pq.add(11);
        pq.add(1);
        pq.add(9);
        pq.poll();

        //pq.offer(11);
        //System.out.println(pq.peek());
//        System.out.println(pq.poll());

        System.out.println(pq);
    }
}
class Test{
    public String test(){
        int[] a = new int[5];
        return Arrays.toString(a);
    }
}