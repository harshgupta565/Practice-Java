package Strings.L2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestWordInString {
    public static void main(String[] args) {
        String str = "Hi  i am harsh";
        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            map.put(words[i],words[i].length());
        }
        int max = Collections.max(map.values());
       for(String key : map.keySet()) {
           if(key.length()>=max) {
               System.out.println(key);
           }
       }
        System.out.println(map.size());
        System.out.println(max);
    }
}
