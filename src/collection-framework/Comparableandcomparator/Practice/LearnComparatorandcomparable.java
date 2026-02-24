package Practice;
import java.util.*;
public class LearnComparatorandcomparable {
    public static void main(String[] args) {
        Animal a1 = new Animal("Bruno", 5, 65);
        Animal a2 = new Animal("Tommy", 6, 70);
        Animal a3 = new Animal("huggy", 5, 65);
        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println( Collections.binarySearch(dogs, a2));
        System.out.println(Collections.max(dogs));
        System.out.println(Collections.min(dogs));
    }

}
