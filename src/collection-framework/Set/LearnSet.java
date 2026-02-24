import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set <Integer> set3 = new TreeSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(45);

        System.out.println(set);
        set.remove(45);
        System.out.println(set);

        // Tree set methods binary search tree implement krta hh internally to elements sorted ho jaate hh
        set3.add(45);
        set3.add(5);
        set3.add(4);
        set3.add(3);
        System.out.println(set3.contains(45)) ;
        System.out.println(set3);
        set3.remove(45);
        System.out.println(set3.contains(45));
        System.out.println(set3);
    }
}
