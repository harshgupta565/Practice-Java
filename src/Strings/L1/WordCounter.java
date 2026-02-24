package Strings.L1;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        boolean flag = false;
        int spacecounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) !=' '){
                if(!flag ) {
                    count++;
                    flag = true;
                }
            }
            else{
                flag = false;
                spacecounter++;
            }

        }
        System.out.println(count);
        System.out.println(spacecounter);
    }
}

// So Goated i Have all ready done with dry of it .