package L1;
//import java.util.*;
//
//public class FrequencyofCharacters {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        HashMap<Character ,Integer> map =new HashMap<>();
//        for(int i=0;i<str.length();i++){
//            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
//
//        }
//        int count=0;
//        for(Map.Entry<Character,Integer> entry:map.entrySet()){
//            if(entry.getValue()>1){
//                count++;
//            }
//
//        }
//        System.out.println(count);
//    }
//
//}

import java.util.*;

public class FrequencyofCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Printing output
        System.out.println("Character Frequency:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}


