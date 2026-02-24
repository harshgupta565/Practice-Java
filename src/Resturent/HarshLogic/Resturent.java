package Resturent.HarshLogic;

import java.util.*;

class details{
    String item;
    int price;
    int rating;
    public details(String item, int price, int rating) {
        this.item = item;
        this.price = price;
        this.rating = rating;
    }
    void additem(List<details> list , String item) {
  list.add(new details(item, price, rating));
        System.out.println("item added" + list);
    }
    void removeitem(List<details> list , String item) {
 list.remove(new details(item, price, rating));
        System.out.println("item removed" + list);
    }
    public String toString() {
        return item + " : " + price + " : " + rating;
    }

}
public class Resturent {
    public static void main(String[] args) {
        List<details>list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //while(sc.hasNext())
        String item = sc.nextLine();
        String removeitem = sc.nextLine();
        int price = sc.nextInt();
        sc.nextLine();
        int rating = sc.nextInt();
        sc.nextLine();
        details d = new details(item,price,rating);
        list.add(d);
        d.additem(list,item);
        d.removeitem(list,removeitem);

        System.out.println(list.toString());
    }
}

