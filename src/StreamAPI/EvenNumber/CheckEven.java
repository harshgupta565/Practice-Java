package StreamAPI.EvenNumber;
import java.util.*;
import java.util.stream.Collectors;

public class CheckEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3,2,3,7 ,4, 5, 6, 7, 8, 9, 10);
        List<Integer>lists= list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(lists);


        List<Integer>sortedList = list.stream().
                sorted().toList();
        System.out.println(sortedList);
        // for Desecnding order
        List<Integer>DesList = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(DesList);

        // distnict
        List <Integer>dislist = list.stream()
                .distinct().toList();
    }
}
