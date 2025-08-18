package StreamProb;

import java.util.stream.IntStream;

public class CheakNumberIsPerfectSquareUsingLamda {
    public static void main(String[] args) {
        int num=25;
        boolean t=IntStream.rangeClosed(2,num/2).anyMatch(i->i*i==num);
        System.out.println(t);
    }
}
