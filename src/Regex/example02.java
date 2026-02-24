package Regex;

import java.util.*;
public class example02 {
    public static void main(String[] args) {
        String s = "hars01h";
        if(s.matches("[a-z]+")){
            System.out.println("yes ");
        }
        else{
            System.out.println("No");
        }
    }
}
