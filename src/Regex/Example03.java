package Regex;

import java.util.*;
public class Example03 {
    public static void main(String[] args) {
        String str = "harshgupta";
        if(str.matches("harsh")){
            System.out.println("your are set ");
        }
        else{
            System.out.println("there is something bad ");
        }
    }
}
