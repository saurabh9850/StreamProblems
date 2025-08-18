package StreamProb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CalculateFactorialUsingLambda {
    public static void main(String[] args) {
        int num=5;
        int fact= IntStream.rangeClosed(1,num).reduce(1,(k,b)->k*b);
        System.out.println(fact);

    }
}
