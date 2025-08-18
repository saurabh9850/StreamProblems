package StreamProb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicProbm {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6,7,8,9);

        //Stream<Integer> s=list.stream();
       // List<Integer> list1=s.filter(i->i%2==0).collect(Collectors.toList());
        //System.out.println(list1);
        List<Integer> list2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list2);
        List<Integer> list3=list.stream().filter(i->(i>5)).collect(Collectors.toList());
        System.out.println(list3);
        List<String> list4=List.of("Saurabh","Ajay","Vijay","Sanjay");
        List<String> s8=list4.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
        System.out.println(s8 );
        List<String> s7=list4.stream().filter(e->e.length()>4).collect(Collectors.toList());
        System.out.println(s7);
        List<Integer> list6=List.of(1,3,5,7,89,56);
        List<Integer> newList=list6.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newList);
        int number=list6.stream().min(Integer::compareTo).get();
        System.out.println(number);
        int num2=list6.stream().max((Integer::compareTo)).get();
        System.out.println(num2);
        List<Integer> list88 = Arrays.asList(2, 4, 4, 6, 6, 8, 8);
        List<Integer> list99=list88.stream().distinct().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list99);
    }


}
