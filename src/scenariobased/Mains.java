package scenariobased;
import java.util.*;

// Custom Exception
class InvalidStepCountException extends Exception {
    InvalidStepCountException(String msg) {
        super(msg);
    }
}

public class Mains {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] steps = new int[7];

        try {
            System.out.print("Enter 7 day steps: ");
            for (int i = 0; i < 7; i++) {
                steps[i] = sc.nextInt();

                if (steps[i] < 0 || steps[i] > 100000) {
                    throw new InvalidStepCountException("Step count must be between 0 and 100000");
                }
            }

            int total = 0;
            int max = steps[0];
            int min = steps[0];

            for (int i = 0; i < 7; i++) {
                total += steps[i];

                if (steps[i] > max)
                    max = steps[i];

                if (steps[i] < min)
                    min = steps[i];
            }

            int avg = total / 7;
            String activity;

            if (avg >= 10000)
                activity = "Active";
            else if (avg >= 7000)
                activity = "Moderate";
            else
                activity = "Sedentary";

            // Summary Output
            System.out.println("\nTotal Steps: " + total);
            System.out.println("Average Steps: " + avg);
            System.out.println("Highest: " + max);
            System.out.println("Lowest: " + min);
            System.out.println("Activity Level: " + activity);

        } catch (InvalidStepCountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


