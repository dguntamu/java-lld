package scalar.discussion2;

import java.util.HashSet;

class Dis2Q1 {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add(null);

        set.add("One");

        for (String s : set)
            System.out.println(s);
    }

}