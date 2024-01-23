package lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * prior Java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        /**
         * Logic- o1<o2 -> -1 || o1==o2 -> 0 || o1>o2 ->1
         */
        System.out.println("Result of Comparator is :" + comparator.compare(2,1));


        //After Java 8 Lambda method

        Comparator<Integer> comparatorLambda0 = (Integer a, Integer b) -> {
            return a.compareTo(b);
        };

        System.out.println("Result of Lambda comparator is :" + comparatorLambda0.compare(12,12));

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) ->  a.compareTo(b);

        System.out.println("Result of Lambda comparator is :" + comparatorLambda.compare(0,1));

        Comparator<Integer> comparatorLambda1 = ( a,  b) ->  a.compareTo(b);

        System.out.println("Result of Lambda comparator is :" + comparatorLambda1.compare(3,2));

    }


}
