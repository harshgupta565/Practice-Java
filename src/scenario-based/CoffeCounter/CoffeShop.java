import java.util.Scanner;

public class CoffeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while (true) {
            System.out.println("Enter type of Coffee and Quantity , for exit choose exit  : ");
            String Coffetype = sc.nextLine();
            if (Coffetype.equalsIgnoreCase("Exit")) {
                System.out.println("Thank you all done");
                break;
            }

            System.out.println("Enter Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
           int price = 0;
            switch (Coffetype) {
                case "Capaciono":
                    System.out.println(" coffe ordered ");
                    price = 120;
                    break;
                case "hot coffee":
                    System.out.println(" coffe ordered ");
                    price = 100;
                    break;
                case "cold coffee":
                    System.out.println(" coffe ordered ");
                    price = 150;
                    break;

            }
            double bill = (price * quantity )+ (0.05 * price);
            System.out.println("Coffee Ordered  and bill is " + bill);

        }
    }
}