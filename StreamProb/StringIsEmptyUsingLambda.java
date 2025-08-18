package StreamProb;

import java.util.function.Predicate;

public class StringIsEmptyUsingLambda {
    public static void main(String[] args) {
        String s="";
        String s1="Saurbh";
        Predicate<String> p=(z)->z.isEmpty();
        System.out.println(p.test(s));
        System.out.println(p.test(s1));
    }
}
