package L1;
// question is asking for revert 0 and 1  as of k times and makes its maximum length of Strings can be obtained .
import java.util.Scanner;

public class InfoysyExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();
        int zerocounter = 0;
        int onecounter = 0;
        int k = sc.nextInt();
        if(len%2 != 0){
            System.out.println("ERROR");
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ( ch == '0') {
                zerocounter++;
            }
            if (ch == '1') {
                onecounter++;}
            }
        int diff = Math.abs(onecounter - zerocounter);
//        System.out.println("diff is "+diff);
        if(onecounter == zerocounter) {
            System.out.println(len);
        }if(diff == 1 && k == 1){
            System.out.println(len);
        }
        else if (diff/2 == k) {
                System.out.println(len);
            }
            else {
            int result = diff - k;
            int output = len - result;
            System.out.println(output);
        }
        }
    }

 // example 011 diff = 1 k =1 is effiecient
// ex 0111 diff = 2 , but k = 1 is enough
// ex 011111  diff = 4 , but k = 2 is enough
// ex 01111111 diff = 6 , but k = 3 is enogh
// ex 0111111111  diff = 8 , but  k =  4 is
// Bhai ekk question to ho gya thaa
