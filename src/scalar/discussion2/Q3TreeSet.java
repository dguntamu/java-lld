package scalar.discussion2;

import java.util.TreeSet;

public class Q3TreeSet {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Scaler");
        treeSet.add("InterviewBit");
        treeSet.add("Coders");
        treeSet.add("Coders");

        for (String temp : treeSet)
            System.out.printf(temp + " ");
        System.out.println("\n");

    }

}