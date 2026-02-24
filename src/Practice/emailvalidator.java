//package Practice;
//import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//class Validator {
//    void checker(String input){
//        Pattern p = Pattern.compile("^[a-z]{3,}\\.[a-z]{3,}\\d{4,}@(hr|it|finance|admin)\\.company\\.com$");
//        Matcher m = p.matcher(input);
//
//        if(m.matches()){
//            System.out.println("valid");
//
//        } else {
//            System.out.println("invalid");
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Validator validator = new Validator();
//
//        int n = sc.nextInt();
//        sc.nextLine();   // important (buffer clear)
//
//        for (int i = 0; i < n; i++) {
//            String email = sc.nextLine().trim();
//            validator.checker(email);
//        }
//    }
//}