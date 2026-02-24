package Strings.L2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
        }
        for (int i = 0; i < str2.length(); i++) {
            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
        }
        if(map1.equals(map2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}