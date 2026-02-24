package Lpu.StudentRecordManagement.Email;

import java.util.Scanner;
import java.util.regex.*;
import java.util.*;
public class ParagraphValid {
    // Leap Year Check
    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Date Validation with Logic
    public static boolean isValidDate(String date) {

        Pattern p = Pattern.compile("^(200[9]|20[1-9][0-9])\\-(0[1-9]|1[0-2])\\-(0[1-9]|[12][0-9]|3[01])$");
        Matcher m = p.matcher(date);

        if (!m.matches()) return false;

        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        // April month validation (30 days)
        if (month == 4 && day > 30) return false;

        // February validation
        if (month == 2) {
            if (isLeap(year) && day > 29) return false;
            if (!isLeap(year) && day > 28) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        String[] parts = input.split("\\|");

        if (parts.length != 5) {
            System.out.println("INVALID");
            return;
        }

        String txn = parts[0];
        String date = parts[1];
        String amount = parts[2];
        String currency = parts[3];
        String status = parts[4];

        // 1️⃣ TXN Validation
        boolean validTxn = txn.matches("^TXN\\-[1-9][0-9]{5}$");

        // 2️⃣ Date Validation
        boolean validDate = isValidDate(date);

        // 3️⃣ Amount Validation
        boolean validAmount = amount.matches("^(0\\.[0-9]+|[1-9][0-9]{0,5}\\.[0-9]{2})$");

        // Additional numeric check (< 999999.99)
        if (validAmount) {
            double value = Double.parseDouble(amount);
            if (value >= 999999.99) validAmount = false;
        }

        // 4️⃣ Currency Validation
        boolean validCurrency = currency.matches("^(USD|INR|EUR|GBP)$");

        // 5️⃣ Status Validation
        boolean validStatus = status.matches("^(SUCCESS|FAILED|PENDING)$");

        if (validTxn && validDate && validAmount && validCurrency && validStatus) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
    }
}
