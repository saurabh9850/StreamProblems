package StreamProb;

import java.util.Arrays;
import java.util.List;

public class FindSecondLargestAndSmallestbyLambda {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,56,78,54,7);
        List<Integer> list1=list.stream().distinct().sorted().toList();
        System.out.println(list1.get(0));
        System.out.println(list1.get(list1.size()-2));
        //OR
        int secMax=list.stream().distinct().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().orElseThrow();
        System.out.println(secMax);
    }


}
