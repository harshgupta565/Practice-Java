package Lpu.StudentRecordManagement.Email;
import java.util.regex.*;
import java.util.*;

class Validator {
    String checker(String input){
        Pattern p = Pattern.compile(
                "^[a-z]{3,}\\.[a-z]{3,}\\d{4,}@(hr|it|finance|admin|sales)\\.company\\.com$"
        );

        Matcher m = p.matcher(input);

        if(m.matches()){
            return "VALID";
        } else {
            return "INVALID";
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();

        int n = sc.nextInt();
        sc.nextLine();

        List<String> results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String email = sc.nextLine().trim();
            results.add(validator.checker(email));
        }

        // Print after taking all inputs
        for(String res : results){
            System.out.println(res);
        }
    }
}