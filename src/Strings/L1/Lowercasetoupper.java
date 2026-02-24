package Strings.L1;

import java.util.Scanner;

public class Lowercasetoupper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String  result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch  =str.charAt(i);
            result += (char)(ch-32);
            // ch+32 for uppertolowercase
        }
        System.out.println(result);
    }
}
