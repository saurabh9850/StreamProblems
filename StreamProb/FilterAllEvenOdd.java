package StreamProb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAllEvenOdd {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,3,4,4,4,4,45);
        List<Integer> Even=list.stream().filter((i)->i%2==0).collect(Collectors.toList());
        System.out.println(Even);
        List<Integer> Odd=list.stream().filter((i)->i%2!=0).collect(Collectors.toList());
        System.out.println(Odd);
    }
}
