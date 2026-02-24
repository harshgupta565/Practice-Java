package Strings.L1;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     String str = sc.nextLine();
     String rev = "";
        System.out.println(str);
        for (int i = str.length()-1; i >=0 ; i++) {
             rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}

// this by using for loop