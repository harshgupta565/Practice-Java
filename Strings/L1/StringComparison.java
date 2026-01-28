package L1;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        Boolean iseual = true;
        if(str1.length()!=str2.length()){
            System.out.println("Strings are not equal");
            iseual = false;
        }else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    //System.out.println(str1.charAt(i)+" is same  "+str2.charAt(i));
                    iseual = true;
                }
            }
        }
        System.out.println(iseual);
    }
}
