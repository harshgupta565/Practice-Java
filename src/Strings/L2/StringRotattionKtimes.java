package Strings.L2;

import java.util.Scanner;

public class StringRotattionKtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int  k = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the String");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int start = str.indexOf(str.charAt(0));
        int end = str.length() - 1;
        k = k % str.length();
reverse(arr,start,end);
reverse(arr,start,k-1);
reverse(arr,k+1,end);
        System.out.println(new String(arr));


        }
    public static void  reverse ( char []arr, int start, int end){
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    }
