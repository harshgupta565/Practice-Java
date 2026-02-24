package Strings.L2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonReaptingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

        }
       for(int i = 0; i < str.length(); i++){
           if(map.get(str.charAt(i))  == 1){
               System.out.println("the first charachter is "+str.charAt(i));
               break;
           }
       }
        System.out.println();
    }
}
