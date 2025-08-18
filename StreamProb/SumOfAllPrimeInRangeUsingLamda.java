package StreamProb;

import java.util.stream.IntStream;

public class SumOfAllPrimeInRangeUsingLamda {
    public static void main(String[] args) {
        int range=50;
        int sum= IntStream.rangeClosed(1,range).filter(SumOfAllPrimeInRangeUsingLamda ::isPrime).sum();
        System.out.println(sum);
    }
    static boolean  isPrime(int num){
        if(num<2) return false;
        return IntStream.rangeClosed(2,num/2).noneMatch(a->num%a==0);

    }
}
