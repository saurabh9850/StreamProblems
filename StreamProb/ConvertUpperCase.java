package StreamProb;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class ConvertUpperCase {
    public static void main(String[] args) {
        String str="Saurabh";
        Function<String,String> lwr=(String s)->s.toLowerCase();

        System.out.println(lwr.apply(str));
        Function<String,String> upr=(String s)->s.toUpperCase();
        System.out.println(upr.apply(str));
    }
}
