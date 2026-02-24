package collectionframework;
import java.util.HashMap;
import java.util.Map;

public class Learn {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("id", "1");
        map.put("name", "Harsh");
//        they both will   not  store beacuse  same key is not allow
//        map.put("id","2");
//        map.put("name","Amit");
        map.put("student", "Amit");
        map.put("abc", "bcz");
        System.out.println(map.get("student"));
        System.out.println(map);
        // prints the value in it
        System.out.println(map.values());

    }
}