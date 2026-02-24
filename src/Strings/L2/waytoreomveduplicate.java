package Strings.L2;

import java.util.Scanner;

public class waytoreomveduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for(int i=0;i<str.length();i++){
            if(result.indexOf(str.charAt(i)) == -1  && str.charAt(i) != ' '){
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
