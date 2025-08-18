package StreamProb;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.IntStream;

public class MaxAndMinNumberInListUsingLamda {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,56,54,67,67,89);
        int maxNum=list.stream().max((a,b)->a.compareTo(b)).orElseThrow(NoSuchElementException::new);
        System.out.println(maxNum);
        int minNum= list.stream().min((a,b)->a.compareTo(b)).orElseThrow(NoSuchElementException::new);
        System.out.println(minNum);
    }

}
