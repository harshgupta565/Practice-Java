package Lpu.StudentRecordManagement;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

// Custom exception for invalid input
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class ValidationExample {
    // Email regex pattern
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

    // Date regex pattern (dd/mm/yyyy)
    private static final String DATE_REGEX = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

    // Method to validate email
    public static void validateEmail(String email) throws InvalidInputException {
        if (!Pattern.matches(EMAIL_REGEX, email)) {
            throw new InvalidInputException("Invalid Email Format!");
        }
    }

    // Method to validate date
    public static void validateDate(String date) throws InvalidInputException {
        if (!Pattern.matches(DATE_REGEX, date)) {
            throw new InvalidInputException("Invalid Date Format! Use dd/mm/yyyy");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            validateEmail(email);

            System.out.print("Enter date (dd/mm/yyyy): ");
            String date = sc.nextLine();
            validateDate(date);

            System.out.println("Both email and date are valid!");
        } catch (InvalidInputException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}
