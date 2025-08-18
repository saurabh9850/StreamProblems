package StreamProb;
import java.util.*;
public class AverageOfDoubleBByUsingLambda {
    public static void main(String[] args) {
        List<Double> list=Arrays.asList(12.23,13.23,23.12,45.12,6.00,6.56);
        double a=list.stream().mapToDouble((i)->i).average().orElse(0.0);
        System.out.println(a);
        //0R
        double sum=list.stream().reduce(0.0,(z,b)->z+b);
        int s=list.size();
        if(s==0)
            System.out.println("0.00");
        else
            System.out.println(sum/s);
    }



}
