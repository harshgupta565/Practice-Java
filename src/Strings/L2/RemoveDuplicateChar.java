package Strings.L2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Set<Character> set = new LinkedHashSet<>();
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
              set.add(str.charAt(i) );

        }
        System.out.println(set);
        String answer  = set.toString();
        System.out.println(answer);
    }
}