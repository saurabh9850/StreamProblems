package StreamProb;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveIntergerDuplicateUsingLambda {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,5,4,5,7,8,9,89,76,3,5,756,45);
        List<Integer> list1=list.stream().distinct().toList();
        System.out.println(list1);
        //OR
        Set<Integer> set=new HashSet<>();
        List<Integer> list2=list.stream().filter((i)->set.add(i)).collect(Collectors.toList());
        System.out.println(list2);


    }
}
