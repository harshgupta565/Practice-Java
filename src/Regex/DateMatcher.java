package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatcher {
    public static void main(String[] args) {
        String Str = "2025/12/12";
        Pattern p = Pattern.compile("\\d{4}/\\d{2}/\\d{2}");
        Matcher m = p.matcher(Str);
        Boolean isMatch = m.matches();
        System.out.println("Your Date is " + isMatch);
    }
}
