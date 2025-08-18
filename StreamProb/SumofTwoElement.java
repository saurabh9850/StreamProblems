package StreamProb;
interface Sum{
    int add(int a,int b);
}
public class SumofTwoElement {
    public static void main(String[] args) {
        Sum sum=(int a,int b)->a+b;
        int Addition=sum.add(1,4);
        System.out.println(Addition);


    }
}
