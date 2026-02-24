package Comparator.Comparaotr;

import java.util.ArrayList;
import java.util.*;
class Stringlengthcomparison implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}
public class Stringlength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String>list = Arrays.asList("harsh","Anki","Ankita");

        list.sort(new Stringlengthcomparison());
        System.out.println(list);
    }
}
