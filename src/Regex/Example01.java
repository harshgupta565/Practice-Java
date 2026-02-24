package Regex;

import java.util.*;
public class Example01 {
    public static void main(String[] args) {
        String str = "352645sd";
    if(str.matches("\\d+")){
            System.out.println("good");
        }
    else {
            System.out.println("bad");
    }
    }
}
