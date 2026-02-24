package Strings.L2;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        String result = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result = result + str.charAt(i - 1);
                result = result + count;
                count = 1;
            }
            result = result + str.charAt(str.length() - 1);
            result = result + count;
        }
        System.out.println(result);
    }
}