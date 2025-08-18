package StreamProb;
import java.lang.reflect.Array;
import java.util.*;

public class SumOfAllSquaresofOddAndEvenInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,5,67,4,8);
        int EvenSum=list.stream().filter(n->n%2==0).map(n->n*n).reduce(0,Integer::sum);
        System.out.println(EvenSum);
        int OddSum=list.stream().filter(n->n%2!=0).map(n->n*n).reduce(0,Integer::sum);
        System.out.println(OddSum);


    }
}
