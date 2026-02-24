package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddress {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("//12+//[0-9]");
        Matcher m = p.matcher("128");
        boolean b = m.matches();
        System.out.println(b);
    }
}
