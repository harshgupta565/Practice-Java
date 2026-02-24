package Arrays.L2;

import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        String[] str = new String[n];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   // ✅ input le rahe hain

            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                str[i] = "FizzBuzz";
            }
            else if (arr[i] % 3 == 0) {
                str[i] = "Fizz";
            }
            else if (arr[i] % 5 == 0) {
                str[i] = "Buzz";
            }
            else {
                str[i] = String.valueOf(arr[i]);  // number ko string bana diya
            }
        }

        System.out.println(Arrays.toString(str));
    }
}