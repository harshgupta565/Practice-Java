package Resturent.New;

import java.util.*;

class Restaurant {

    String itemName;
    double price;
    int rating;

    Restaurant(String itemName, double price, int rating) {
        this.itemName = itemName;
        this.price = price;
        this.rating = rating;
    }

    // Add item method
    public static void addItem(List<Restaurant> list, String name, double price, int rating) {
        list.add(new Restaurant(name, price, rating));
        System.out.println(name + " added successfully.");
    }

    // Remove item method
    public static void removeItem(List<Restaurant> list, String name) {

        Iterator<Restaurant> it = list.iterator();

        while (it.hasNext()) {
            Restaurant r = it.next();
            if (r.itemName.equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("Restaurant " + name + " has been removed");
                return;
            }
        }

        System.out.println("Item not found");
    }

    public static double calculateAverageRating(List<Restaurant> list) {
        int sum = 0;
        for (Restaurant r : list) {
            sum += r.rating;
        }
        return list.isEmpty() ? 0 : (double) sum / list.size();
    }
}

public class logic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Restaurant> list = new ArrayList<>();

        // Input read
        while (sc.hasNext()) {
            String name = sc.next();
            double price = sc.nextDouble();
            int rating = sc.nextInt();

            Restaurant.addItem(list, name, price, rating);
        }

        // Print all
        for (Restaurant r : list) {
            System.out.println(r.itemName + " " + r.price + " " + r.rating);
        }

        System.out.println("Average Rating: " +
                Restaurant.calculateAverageRating(list));

        sc.close();
    }
}
