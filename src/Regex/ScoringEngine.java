package Regex;

import java.util.Scanner;

public class ScoringEngine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();
        String str = "";
        for(int i = 0; i < n; i++){
            str = str + input.next();
            System.out.println(str);
        }
//        System.out.println(str);
    }
}
