package FitnessTracker;

import java.util.Scanner;
class InvalidException extends Exception {
    public InvalidException(String message) {
        super(message);
    }
}
public class Application {
    public static void main(String[] args) throws InvalidException {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String[] strresult = str.split(":");
        String activityName = strresult[0];
        int durationshours = Integer.parseInt(strresult[1]);
        int intensityLevel = Integer.parseInt(strresult[2]);
        if (!(durationshours > 0 && intensityLevel > 0 && 9 < intensityLevel)) {
            throw new InvalidException("Error:Invalid activity name.");
        } else if (intensityLevel < 0) {
            throw new InvalidException("Error:Invalid activity  duration or intensity.");
//        } else  () {
//
//        }
        }

    }
}
