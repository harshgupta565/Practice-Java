package Regex;

//import java.util.Scanner;
//import java.util.regex.*;
//public class DocumentReductionEngine {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//    }
//}
import java.util.*;

public class DocumentReductionEngine {

    public static String processLine(String input) {
        String s = input;

        // Rule 1 — Mask National ID
        // ID:ABC123456 → ID:XXX******
        s = s.replaceAll("ID:[A-Z]{3}\\d{6}", "ID:XXX******");

        // Rule 2 — Mask Bank Account
        // ACCT-1234-5678-9999 → ACCT---9999
        s = s.replaceAll("ACCT-\\d{4}-\\d{4}-(\\d{4})", "ACCT---$1");
        s = s.replaceAll("(?i)\\b(\\w+)\\s+\\1\\b", "$1");

        // Rule 4 — Fix trailing symbols
        // !!! → !
        s = s.replaceAll("([!?\\.])\\1{2,}$", "$1");

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

       for (int i = 0; i < n; i++){
     //   while(sc.hasNext()){
            String line = sc.nextLine();
            System.out.println(processLine(line));

        }
        System.out.println("No sensitive data here......");
    }
}