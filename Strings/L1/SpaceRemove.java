package L1;

import java.util.Arrays;
import java.util.Scanner;

public class SpaceRemove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        System.out.println(str1);
        String str2 = str1.replaceAll(" " ,"");
        System.out.println(str2);
    }
}
