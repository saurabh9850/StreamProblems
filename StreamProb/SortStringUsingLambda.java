package StreamProb;
import java.util.*;
public class SortStringUsingLambda {
    public static void main(String[] args) {
    List<String> list=Arrays.asList("saurabh","chavan","vijay","ajay");
    list.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(list);
    }
}
