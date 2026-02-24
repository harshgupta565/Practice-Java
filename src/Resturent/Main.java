package Resturent;

import java.util.*;

class Restaurant {

    String itemName;   // ❌ static removed
    double price;
    int rating;

    Restaurant(String itemName, double price, int rating) {
        this.itemName = itemName;
        this.price = price;
        this.rating = rating;
    }

    public static double calculateAverageRating(List<Restaurant> list) {
        int sum = 0;
        for (Restaurant r : list) {
            sum += r.rating;
        }
        return list.size() == 0 ? 0 : (double) sum / list.size();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Restaurant> list = new ArrayList<>();

        while (sc.hasNext()) {

            String name = sc.next();
            double price = sc.nextDouble();
            int rating = sc.nextInt();

            list.add(new Restaurant(name, price, rating));
        }

        for (Restaurant r : list) {
            System.out.println(r.itemName + " " + r.price + " " + r.rating);
        }

        System.out.println("Average Rating: " +
                Restaurant.calculateAverageRating(list));
    }
}