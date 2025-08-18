package StreamProb;

import java.util.stream.IntStream;

public class CheackStringIsPalindromeUsingLambda {
    public static void main(String[] args) {
        String s="ono";
        boolean t= IntStream.rangeClosed(0,s.length()/2).allMatch((i)->s.charAt(i)==s.charAt(s.length()-i-1));
        System.out.println(t);

    }
}
