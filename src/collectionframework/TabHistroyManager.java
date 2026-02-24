package collectionframework;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TabHistroyManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabNumber = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        list.add(sc.nextInt());
        stack.push(tabNumber);
        System.out.println(list);
        list.addFirst(tabNumber);
    }
}
