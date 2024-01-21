import java.util.stream.IntStream;

//sum of first 100 numbers;
public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
//        imperative way
        int sum=0;
        for(int i=0;i<=100;i++) {
            sum+=i;
        }
        System.out.println("Imperative way " + sum);

//        Declarative way
        int sum1 = IntStream.rangeClosed(0,100).sum();
        System.out.println("Declarative way " + sum1);
    }
}
