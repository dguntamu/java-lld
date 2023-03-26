package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEg {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,6);
        List<Integer> list2 = Arrays.asList(2,9);
        List<Integer> list3 = Arrays.asList(4,10);

        List<List<Integer>> complexList = Arrays.asList(list1,list2,list3);

        //List<Integer> result = complexList.stream().flatMap(l -> l.stream()).filter(n -> (n%2==0)).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> result = complexList.stream().flatMap(l -> l.stream().map(a -> a+10)).filter(n -> (n%2==0)).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
