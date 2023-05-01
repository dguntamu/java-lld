package scalar.discussion2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Q5Stack {

    public static void main(String[] args)

    {
        List<String> list = new LinkedList<>();
        list.add("Scaler");
        list.add("For");
        list.add("Coders");
        list.add("InterviewBit");
        //Iterator<Integer> iter = list.iterator();
        Iterator<String> iter = list.iterator();

        while (iter.hasNext())
            System.out.printf(iter.next() + " ");
        System.out.println();

    }
}
//OP: COMPILE TIME ERROR