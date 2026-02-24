package StreamAPI.EvenNumber;
import java.util.Scanner;
import java.util.*;
public class Even {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Java", "Python", "Java", "C++", "Java");
        long datacount = courses.stream().filter(x -> x.equals("java")).count();
        System.out.println(datacount);
    }
}
