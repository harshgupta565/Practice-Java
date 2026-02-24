package Strings.L1;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // checking palindrome orginal string comapres with reverse String
        String rev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev+ str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("Not Palindrome ");
        }

    }
}