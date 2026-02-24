package Strings.L1;
import java.util.Scanner;
public class VowelsandConsonant {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
        System.out.println(s);
        int vowelscount=0;
        int consonantcount = 0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' || ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelscount++;
                } else {
                    consonantcount++;
                }
            }
        }
            System.out.println(vowelscount);
            System.out.println(consonantcount);

    }
}
