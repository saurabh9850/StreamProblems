package StreamProb;

import java.util.Arrays;
import java.util.List;

public class CheakWorldIsPresentInListOrNot {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Saurabh","Vijay","Chavan");
        String x="Saurabh";
        boolean t=list.stream().anyMatch(i->i.equalsIgnoreCase(x));
        System.out.println(t);


    }
}
