//find unique elements in a list
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,5,6,7,7,8);

        /*
        *Imperative way
         */
        List<Integer> uniqueList=new ArrayList<>();
        for(Integer it: integerList) {
            if(!uniqueList.contains(it)) {
                uniqueList.add(it);
            }
        }
        System.out.println("Imperative way " + uniqueList);

        /*
        **Declarative way
         */
         List<Integer> uniqueList1=integerList.stream().distinct().collect(Collectors.toList());

        System.out.println("Declarative way " + uniqueList1);
    }

}
