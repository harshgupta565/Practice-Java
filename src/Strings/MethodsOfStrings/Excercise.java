package Strings.MethodsOfStrings;

import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String name = input.nextLine();
        //activityName:durationInHours:intensityLevel
        String [] result = input.nextLine().split(":");
        String activityName = result[0];
        input.nextLine();
        int durationHours = Integer.parseInt(result[1]);
        int  intensityLevel=Integer.parseInt(result[2]);
        System.out.println(activityName +":" + durationHours+":" +intensityLevel);

    }

}
