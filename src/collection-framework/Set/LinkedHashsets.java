import java.util.Set;
import java.util.TreeSet;

public class LinkedHashsets {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("amit");
        set.add("anuj");
        set.add("Harsh");
        set.add("Amit");
        System.out.println(set);
        // string  ke case me ascii value ke base pe sorting krta hh aur capital aur smalll alg alg deal hota hh
    }
}
