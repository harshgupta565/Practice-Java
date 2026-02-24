import java.util.*;

class FoodOrder {
    String name;
    String item;
    int qty;
    double total;

    FoodOrder(String name, String item, int qty, double total) {
        this.name = name;
        this.item = item;
        this.qty = qty;
        this.total = total;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<FoodOrder> list = new ArrayList<>();

        while (true) {
            System.out.print("Employee name (exit to stop): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Food item (Burger/Pizza/Sandwich): ");
            String item = sc.nextLine();
            while (true) {
                double price = 0;

                switch (item) {
                    case "Burger":
                        price = 80;
                        break;
                    case "Pizza":
                        price = 120;
                        break;
                    case "Sandwich":
                        price = 60;
                        break;
                    default:
                        System.out.println("Wrong food item!");
                        continue;
                }

                int qty;
                try {
                    System.out.print("Quantity: ");
                    qty = sc.nextInt();
                    sc.nextLine(); // buffer clear
                } catch (Exception e) {
                    System.out.println("Invalid quantity!");
                    sc.nextLine();
                    continue;
                }

                double total = price * qty;
                list.add(new FoodOrder(name, item, qty, total));

                System.out.println("Order added\n");
            }
        }
        double sum = 0;
        System.out.println("\nOrder Summary:");
        for (FoodOrder o : list) {
            System.out.println(o.name + " - " + o.item + " - ₹" + o.total);
            sum += o.total;
        }

        double gst = sum * 0.05;
        System.out.println("Total: ₹" + sum);
        System.out.println("GST 5%: ₹" + gst);
        System.out.println("Final Bill: ₹" + (sum + gst));

        sc.close();
    }
}


