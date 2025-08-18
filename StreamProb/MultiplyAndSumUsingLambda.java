package StreamProb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MultiplyAndSumUsingLambda {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);
        int sumOfAllEme= list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sumOfAllEme);
        int multiPlication=list.stream().reduce(1,(a,b)->a*b);
        System.out.println(multiPlication);

    }
    }
