package VechileFine;

import java.util.Scanner;

// Business Logic Class
class TravelPackage {

    private String packageCode;
    private int days;
    private String seasonType;
    private double basePrice;

    // Constructor
    public TravelPackage(String packageCode, int days, String seasonType) {
        this.packageCode = packageCode;
        this.days = days;
        this.seasonType = seasonType;
        setBasePrice();
    }

    // Set base price based on package code
    private void setBasePrice() {
        switch (packageCode) {
            case "P123":
                basePrice = 5000;
                break;
            case "P223":
                basePrice = 10000;
                break;
            case "P345":
                basePrice = 12000;
                break;
            default:
                System.out.println("Invalid Package Code");
                basePrice = 0;
        }
    }

    // Calculate final price
    public double calculateFinalPrice() {

        double discount = 0;
        if (days >= 7) {
            discount = basePrice * 0.10;
        }

        double priceAfterDiscount = basePrice - discount;

        double seasonalCharge = 0;

        switch (seasonType) {
            case "season":
                seasonalCharge = basePrice * 0.15;
                break;
            case "peakseason":
                seasonalCharge = basePrice * 0.25;
                break;
            case "offseason":
                seasonalCharge = basePrice * 0.10;
                break;
            default:
                System.out.println("Invalid Season Type");
        }

        return priceAfterDiscount + seasonalCharge;
    }
}

// Main Class
public class Travel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Package Code:");
        String packageCode = sc.nextLine();

        System.out.println("Enter Number of Days:");
        int days = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Season Type:");
        String seasonType = sc.nextLine();

        // Object Creation
        TravelPackage travel = new TravelPackage(packageCode, days, seasonType);

        double finalPrice = travel.calculateFinalPrice();

        System.out.println("Final Price: ₹" + finalPrice);
    }
}