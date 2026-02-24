package ObjectorientedProgramming;

import java.util.*;
public class LearnLsit {
    public static void main(String[] args) {
     List <Integer>list = new ArrayList<>();
     List <Integer>list2 = new ArrayList<>();
     List <String> fruit = new ArrayList<>();
     // its is dyanmic in nature
       list.add(50);
       list.add(60);
       list.add(56);
       list.add(53);
        System.out.println(list.size());
       // elements of list 2
       list2.add(10);
       list2.add(60);
       list2.add(35);
       // elements of list 3
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Pear");
        fruit.add("Orange");
        fruit.add("Watermelon");
        fruit.add("Orange");
        System.out.println( list.size());
        System.out.println(fruit.size());
       System.out.println(list.size());
        System.out.println(list);
        System.out.println(list2);


        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list2);
        list.clear();
        System.out.println(list);
        // methods
        // sublist
        List <String> smalllist = fruit.subList(0,3);
        System.out.println(smalllist);
        System.out.println(fruit.indexOf("Orange"));
        System.out.println(fruit.lastIndexOf("Orange"));
        System.out.println(list.size());
        list.set(1,25643);
        System.out.println(list);
    }
}
/* methods are
* get
* add
* remove
* sublist
* indexof
* lastindexOf
* */
