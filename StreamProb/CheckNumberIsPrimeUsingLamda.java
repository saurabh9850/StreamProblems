package StreamProb;

import java.util.stream.IntStream;

public class CheckNumberIsPrimeUsingLamda {
    public static void main(String[] args) {
        int num=88;
        boolean notPrime=num>1 && IntStream.range(2,num).noneMatch(i->num%i==0);
        System.out.println(notPrime);
    }

}
