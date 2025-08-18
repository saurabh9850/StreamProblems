package StreamProb;

import java.util.Arrays;

public class CountWordsInSentenceByUsingLamda {
    public static void main(String[] args) {
        String sen="hi my name is saurabh and what about you";
        long numOfWords= Arrays.stream(sen.split("\\s+")).count();
        System.out.println(numOfWords);

    }
}
