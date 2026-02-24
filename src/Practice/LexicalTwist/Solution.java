package Practice.LexicalTwist;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
String str2=sc.nextLine();
String str1rev = "";
for(int i=str1.length()-1; i<=0 ;i--){
    str1rev = str1rev + str1.charAt(i);
}
        System.out.println(str1rev);
    }

}
